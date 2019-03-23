package com.moonface.mathbook;

class Data {
    static Section[] sections;

    static {
        sections = new Section[]{
                new Section("אלגברה", "פעולות חשבון, משוואות, מערכות משוואות, חזקות ושורשים, משוואות ריבועיות, אי שוויונים...", R.drawable.ic_algebra, new Topic[]{
                        new Topic("סדר פעולות חשבון", R.drawable.ic_order_of_operations, new Item[]{
                                new Text("בתרגילי שרשרת, שבהם מופיעה יותר מפעולה אחת, הגדירו סדר לפעולות החשבון - פעולות מסוימות מבוצעות לפני פעולות אחרות. סדר הפעולות הוא:" +
                                        "\n \u2022 סוגריים" +
                                        "\n \u2022 חזקות ושורשים" +
                                        "\n \u2022 כפל וחילוק" +
                                        "\n \u2022 חיבור וחיסור" +
                                        "\n אם יש כמה פעולות מאותה רמה, מבצעים אותן משמאל לימין.")
                        }),
                        new Topic("מספרים מכוונים", R.drawable.ic_negative_numbers, new Item[]{
                                new Text(" עד כה אנחנו מכירים את המספרים הטבעיים (המספרים השלמים שגדולים או שווים ל0). כעת נוסיף להם את המספרים השליליים ונגדיר קבוצה חדשה של מספרים - המספרים השלמים."),
                                new Text("ערך מוחלט").setTextStyle(Text.TextStyle.bold),
                                new Text("ערך מוחלט של מספר הוא גודל המספר ללא הסימן. מסמנים ערך מוחלט על ידי שני קווים אנכיים מצידיו של המספר."),
                                new Formula("$$|n|=n\\qquad(n>0)$$" +
                                        "\n$$|n|=-n\\qquad(n<0)$$"),
                                new Text("פעולות במספרים מכוונים").setTextStyle(Text.TextStyle.bold),
                                new Text("חיבור:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(a<0,\\space b<0)$$" +
                                        "\n$$a+b=-(|a|+|b|)$$"),
                                new Formula("$$(a<0,\\space b>0)$$" +
                                        "\n$$a+b=-(|a|-|b|)$$"),
                                new Formula("$$(a>0,\\space b<0)$$" +
                                        "\n$$a+b=|a|-|b|$$"),
                                new Text("חיסור:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(a<0,\\space b<0)$$" +
                                        "\n$$a-b=a+|b|$$"),
                                new Formula("$$(a<0,\\space b>0)$$" +
                                        "\n$$a-b=-(|a|+b)$$"),
                                new Formula("$$(a>0,\\space b<0)$$" +
                                        "\n$$a-b=a+|b|$$"),
                                new Text("כפל:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(a<0,\\space b<0)$$" +
                                        "\n$$a \\times b=|a| \\times |b|$$"),
                                new Formula("$$(a<0,\\space b>0)$$" +
                                        "\n$$a \\times b=-(|a| \\times b)$$"),
                                new Formula("$$(a>0,\\space b<0)$$" +
                                        "\n$$a \\times b=-(a \\times |b|)$$"),
                                new Text("חילוק:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(a<0,\\space b<0)$$" +
                                        "\n$$a \\div b=|a| \\div |b|$$"),
                                new Formula("$$(a<0,\\space b>0)$$" +
                                        "\n$$a \\div b=-(|a| \\div b)$$"),
                                new Formula("$$(a>0,\\space b<0)$$" +
                                        "\n$$a \\div b=-(a \\div |b|)$$"),
                        }),
                        new Topic("שברים", R.drawable.ic_fraction, new Item[]{
                                new Text("שבר הוא דרך לייצוג של מנה. לשבר יש שני חלקים: מונה (המחולק, למעלה) ומכנה (המחלק, למטה). בין המונה והמכנה נמצא קו השבר."),
                                new Text("פעולות בשברים").setTextStyle(Text.TextStyle.bold),
                                new Text("חיבור וחיסור שברים:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{a}{c}\\pm\\frac{b}{c}=\\frac{a\\pm b}{c}$$"),
                                new Formula("$$\\frac{a}{b}\\pm\\frac{c}{d}=\\frac{a\\times d}{b\\times d}\\pm\\frac{c\\times b}{b\\times d}=\\frac{a\\times d\\pm c\\times b}{b\\times d}$$"),
                                new Text("כפל שברים:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{a}{b}\\times\\frac{c}{d}=\\frac{a \\times c}{b \\times d}$$"),
                                new Text("חילוק שברים:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{a}{b}\\div\\frac{c}{d}=\\frac{a}{b}\\times\\frac{d}{c}=\\frac{a\\times d}{b \\times c}$$"),
                                new Text("צמצום:").setTextStyle(Text.TextStyle.underline),
                                new Text("אם המונה והמכנה הם מכפלה (או שניתן להביא אותם למכפלה), ומופיע בהם גורם משותף, ניתן לחלק בו:"),
                                new Formula("$$\\frac{a\\times b}{b\\times c}=\\frac{a}{c}$$"),
                        }),
                        new Topic("פתיחת סוגריים", R.drawable.ic_parenthesis_opening, new Item[]{
                                new Text("ראינו כבר שעל פי סדר פעולות חשבון, מחשבים בראש ובראשונה ביטוי הכתוב בתוך סוגריים. אך לפעמים, אם הביטוי כולל נעלם, אנחנו לא יכולים לחשב אותו בלי להיפטר מהסוגריים. ישנם כמה מקרים בהם נרצה להיפטר מהסוגריים, ההבדל ביניהם הוא מה בא לפני הסוגריים:"),
                                new Text("חיבור:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$...+(a+b+c)=...+a+b+c$$"),
                                new Text("חיסור:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$...-(a+b+c)=...-a-b-c$$"),
                                new Text("מכפלה בגורם:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$...n(a+b+c)=na+nb+nc$$"),
                                new Text("חלוקה בגורם:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{na+nb}{n}=a+b$$"),
                                new Text("מכפלת סוגריים").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(a+b)(c+d)=ac+ad+bc+bd$$")
                        }),
                        new Topic("משוואות עם נעלם אחד", R.drawable.ic_equation, new Item[]{
                                new Text("לכל משוואה יש שני אגפים - אגף ימין ואגף שמאל כאשר ביניהם יש שוויון (=). המטרה שלנו תהיה למצוא את ערכו של המשתנה, הנעלם (לרוב נקרא x). ניתן לבצע פעולות חשבון על האגפים כל עוד הן מתבצעות על שני האגפים, והשוויון נשמר. נשתמש בפעולות אלו כדי לפתור משוואות."),
                                new Text("דוגמאות:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$3x=6$$"),
                                new Text("נחלק את המשוואה ב3."),
                                new Formula("$$x=2$$"),
                                new Text("בכל משוואה אנחנו נרצה לבודד את x - לראות את x באגף אחד ומספר באגף השני."),
                                new Formula("$$x-8=2$$" +
                                        "\n$$x=10$$"),
                                new Formula("$$5x+12=7$$" +
                                        "\n$$5x=-5$$" +
                                        "\n$$x=-1$$"),
                                new Formula("$$\\frac{x+4}{2}+3x=6-2x$$" +
                                        "\n$$2(\\frac{x+4}{2}+3x)=2(6-2x)$$" +
                                        "\n$$x+4+6x=12-4x$$" +
                                        "\n$$11x=8$$" +
                                        "\n$$x=\\frac{8}{11}$$")
                        }),
                        new Topic("פרופורציות", R.drawable.ic_proportion, new Item[]{
                                new Text("פרופורציה מוגדרת כשוויון בין שני יחסים (מנות). יש מספר תכונות שנכונות לכל פרופורציה."),
                                new Text("אם:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{a}{b}=\\frac{c}{d}$$"),
                                new Text("אז:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$ad=bc$$"),
                                new Formula("$$\\frac{b}{a}=\\frac{d}{c}$$"),
                                new Formula("$$\\frac{a}{c}=\\frac{b}{d}$$"),
                                new Formula("$$\\frac{a+b}{b}=\\frac{c+d}{d}$$"),
                                new Formula("$$\\frac{a-b}{b}=\\frac{c-d}{d}$$")
                        }),
                        new Topic("מערכת משוואות עם שני נעלמים", R.drawable.ic_equation_system, new Item[]{
                                new Text("מערכת משוואות עם שני נעלמים כוללת שתי משוואות שמקשרות בין שני נעלמים (לרוב x,y), כך שניתן למצוא נקודה (ערכי x וy) או קבוצת נקודות שעבורן המשוואות מתקיימות. ניתן לפתור מערכת משוואות על ידי בידוד אחד מהנעלמים באחת המשוואות והצבתו במשוואה השנייה. במצב כזה תתקבל משוואה עם נעלם אחד, שניתן לפתור ולחלץ ממנה את ערך הנעלם. את הערך שהתקבל ניתן להציב במשוואה השנייה ולחלץ את ערכו של הנעלם השני."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\begin{cases}" +
                                        "x+y=4\\\\" +
                                        "x-y=10" +
                                        "\\end{cases}$$\n" +
                                        "$$\\begin{cases}" +
                                        "y=4-x\\\\" +
                                        "x-y=10" +
                                        "\\end{cases}$$\n" +
                                        "$$x-(4-x)=10$$" +
                                        "\n$$x-4+x=10$$" +
                                        "\n$$2x=14$$" +
                                        "\n$$x=7$$" +
                                        "\n$$y=4-7$$" +
                                        "\n$$y=-3$$" +
                                        "\n$$(7,-3)$$"
                                        )
                        }),
                        new Topic("חוקי חזקות", R.drawable.ic_power_rules, new Item[]{

                        }),
                        new Topic("הוצאת גורף משותף", R.drawable.ic_shared_factor, new Item[]{

                        }),
                        new Topic("נוסחאות כפל מקוצר", R.drawable.ic_short_product_formulas, new Item[]{

                        }),
                        new Topic("טרינום", R.drawable.ic_trinom, new Item[]{

                        }),
                        new Topic("משוואה ריבועית", R.drawable.ic_quadratic_equation, new Item[]{

                        }),
                        new Topic("משוואה עם פרמטרים", R.drawable.ic_parametric_equation, new Item[]{

                        }),
                        new Topic("אי שוויונים", R.drawable.ic_inequation, new Item[]{

                        })
                }),
                new Section("גיאומטריה במישור", "משולשים, מרובעים, מעגלים, היקפים ושטחים, יחסים ופרופורציות...", R.drawable.ic_geometry, new Topic[]{

                }),
                new Section("פונקציות", "פונקציה קווית, שיפוע, משוואת פונקציה, גרפים, פרבולות...", R.drawable.ic_functions, new Topic[]{

                }),
                new Section("חשבון דיפרנציאלי ואינטגרלי", "נגזרות,  חקירת פונקציות, פולינומים, פונקציות רציונליות, אינטגרלים...", R.drawable.ic_calculus, new Topic[]{

                }),
                new Section("טריגונומטריה במישור", "משולש ישר זווית, משפט הסינוסים, משפט הקוסינוסים, מעגל היחידה, משוואות טריגונומטריות...", R.drawable.ic_trigonometry, new Topic[]{

                }),
                new Section("סדרות", "סדרה חשבונית, סדרה הנדסית, איבר כללי, סכום, נוסחת נסיגה...", R.drawable.ic_sequences, new Topic[]{

                }),
                new Section("הסתברות", "חוקי ההסתברות, מאורעות תלויים, מאורעות בלתי תלויים, הסתברות מותנית...", R.drawable.ic_probability, new Topic[]{

                }),
                new Section("וקטורים", "פעולות על וקטורים, וקטורים במרחב...", R.drawable.ic_vectors, new Topic[]{

                }),
                new Section("מספרים מרוכבים", "פעולות חשבון במספרים מרוכבים, ייצוג טריגונומטרי, משמעויות גיאומטריות...", R.drawable.ic_complex_numbers, new Topic[]{

                }),
                new Section("גיאומטריה אנליטית", "מרחק בין נקודות, מעגלים, פרבולות, אליפסות...", R.drawable.ic_analytic_geometry)
        };

    }
}
