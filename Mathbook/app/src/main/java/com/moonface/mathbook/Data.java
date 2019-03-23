package com.moonface.mathbook;

class Data {
    static Section[] sections;

    static {
        sections = new Section[]{
                new Section("אלגברה", "פעולות חשבון, משוואות, מערכות משוואות, חזקות ושורשים, משוואות ריבועיות, אי שוויונים...", R.drawable.ic_algebra, new Topic[]{
                        new Topic("סדר פעולות חשבון", R.drawable.ic_order_of_operations, new Item[]{
                                new Text("בתרגילי שרשרת, שבהם מופיעה יותר מפעולה אחת, הגדירו סדר לפעולות החשבון - פעולות מסוימות מבוצעות לפני פעולות אחרות. סדר הפעולות הוא:" +
                                        "\n \u2022 סוגריים" +
                                        "\n \u2022 כפל וחילוק" +
                                        "\n \u2022 חיבור וחיסור" +
                                        "\n אם יש כמה פעולות מאותה רמה, מבצעים אותן משמאל לימין, לפי הסדר."),
                                new Text("לדוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$2\\times(5+7)-6\\div3 =$$" +
                                        "\n$$2\\times12-6\\div3 =$$" +
                                        "\n$$24-2 =$$" +
                                        "\n$$22$$"),
                                new Text("פירמידת פעולות החשבון:").setTextStyle(Text.TextStyle.underline),
                                new Space(100),
                                new Image(R.drawable.ic_pyramid_of_operations, 400, 400),
                        }),
                        new Topic("מספרים מכוונים", R.drawable.ic_negative_numbers, new Item[]{
                                new Text(" עד כה אנחנו מכירים את המספרים הטבעיים (המספרים השלמים שגדולים או שווים ל0). כעת נוסיף להם את המספרים השליליים ונגדיר קבוצה חדשה של מספרים - המספרים השלמים." +
                                        "\nדוגמאות למספרים שליליים:"),
                                new Text("-4, -36, -1584, -1").setAlignment(Text.Alignment.center).setDirection(Text.Direction.ltr),
                                new Text("ערך מוחלט").setTextStyle(Text.TextStyle.bold),
                                new Text("ערך מוחלט של מספר הוא גודל המספר ללא הסימן. מסמנים ערך מוחלט על ידי שני קווים אנכיים מצידיו של המספר: |3-|. דוגמאות:"),
                                new Formula("$$|-3| = 3$$"),
                                new Formula("$$|6| = 6$$"),
                                new Formula("$$|0| = 0$$"),
                                new Formula("$$|-42| = 42$$"),
                                new Text("פעולות במספרים מכוונים").setTextStyle(Text.TextStyle.bold),
                                new Text("חיבור:").setTextStyle(Text.TextStyle.underline),
                                new Text("אם שני המספרים שליליים, התוצאה תהיה חיבור הערכים המוחלטים של המספרים והסימן יהיה -." +
                                        "\nאם אחד מהמספרים חיובי והשני שלילי, התוצאה תהיה חיסור הערכים המוחלטים של המספרים והסימן יהיה כסימן המספר הראשון."),
                                new Text("חיסור:").setTextStyle(Text.TextStyle.underline),
                                new Text("אם שני המספרים שליליים, התוצאה תהיה חיבור של המספר הראשון וערכו המוחלט של המספר השני." +
                                        "\nאם אחד מהמספרים חיובי והשני שלילי, התוצאה תהיה חיבור של המספרים והסימן יהיה הסימן של המספר הראשון"),
                                new Text("כפל וחילוק:").setTextStyle(Text.TextStyle.underline),
                                new Text("אם שני המספרים שליליים, התוצאה תהיה מכפלת/מנת המספרים והסימן יהיה +" +
                                        "\nאם אחד מהמספרים חיובי והשני שלילי, התוצאה תהיה מכפלת/מנת המספרים והסימן יהיה -"),
                                new Text("דוגמאות:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$-5+(-6) = -11$$"),
                                new Formula("$$7+(-3) = 4$$"),
                                new Formula("$$-7+3 = -4$$"),
                                new Formula("$$-4-(-9) = 5$$"),
                                new Formula("$$1-(-2) = 3$$"),
                                new Formula("$$-1-2 = -3$$"),
                                new Formula("$$-6\\times(-3) = 18$$"),
                                new Formula("$$-6\\div(-3) = 2$$"),
                                new Formula("$$-4\\times2 = -8$$"),
                                new Formula("$$-4\\times2 = -2$$")
                        }),
                        new Topic("שברים", R.drawable.ic_fraction, new Item[]{
                                new Text("שבר הוא דרך לייצוג של מנה. לשבר יש שני חלקים: מונה (המחולק, למעלה) ומכנה (המחלק, למטה). בין המונה והמכנה נמצא קו השבר."),
                                new Text("דוגמאות לשברים:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{1}{2} \\space \\space" + "\\frac{5}{6} \\space \\space" + "\\frac{17}{5}$$"),
                                new Text("פעולות בשברים").setTextStyle(Text.TextStyle.bold),
                                new Text("חיבור וחיסור שברים:").setTextStyle(Text.TextStyle.underline),
                                new Text("אם לשני שברים יש אותו מכנה, מחברים / מחסרים את המונים ומשאירים את המכנה:"),
                                new Formula("$$\\frac{a}{c}\\pm\\frac{b}{c}=\\frac{a\\pm b}{c}$$"),
                                new Text("אם לשני שברים יש אותו מכנה, מוצאים את המכנה המשותף הפשוט ביותר ואז מחברים את המונים ומשאירים את המכנה:"),
                                new Formula("$$\\frac{a}{b}\\pm\\frac{c}{d}=\\frac{a\\times d}{b\\times d}\\pm\\frac{c\\times b}{b\\times d}=\\frac{a\\times d\\pm c\\times b}{b\\times d}$$"),
                                new Text("דוגמאות:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{3}{4}-\\frac{2}{4}=\\frac{1}{4}$$"),
                                new Formula("$$\\frac{1}{2}+\\frac{1}{3}=\\frac{3}{6}+\\frac{2}{6}=\\frac{5}{6}$$"),
                                new Text("כפל שברים:").setTextStyle(Text.TextStyle.underline),
                                new Text("כשכופלים שברים מכפילים את המונים ומכפילים את המכנים:"),
                                new Formula("$$\\frac{a}{b}\\times\\frac{c}{d}=\\frac{a \\times c}{b \\times d}$$"),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{4}{5}\\times{4}{3}=\\frac{16}{15}$$"),
                                new Text("חילוק שברים:").setTextStyle(Text.TextStyle.underline),
                                new Text("בשביל לחלק שברים, מבצעים כפל בהופכי, כלומר, מכפילים את השבר הראשון בשבר השני בהופכי:"),
                                new Formula("$$\\frac{a}{b}\\div\\frac{c}{d}=\\frac{a}{b}\\times\\frac{d}{c}=\\frac{a\\times d}{b \\times c}$$"),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{5}{7}\\div\\frac{1}{2}=\\frac{5}{7}\\times\\frac{2}{1}=\\frac{10}{7}$$"),
                                new Text("צמצום:").setTextStyle(Text.TextStyle.underline),
                                new Text("אם המונה והמכנה הם מכפלה (אושניתן להביא אותם לכפלה), ומופיע בהם גורם משותף, ניתן לחלק בו:"),
                                new Formula("$$\\frac{a\\times b}{b\\times c}=\\frac{a}{c}$$"),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{6}{3}=\\frac{3\\times 2}{3}=\\frac{2}{1}=2$$")
                        }),
                        new Topic("משתנים", R.drawable.ic_variables, new Item[]{
                                new Text("משתנה הוא דרך לייצג מספר לא קבוע, שהביטוי / משוואה יתקיים לכל ערך שלו. משתנים מייצגים על ידי אותיות קטנות באנגלית, לרוב משתמשים באותיות:"),
                                new Formula("$$x,y,z$$"),
                                new Text("הערה:").setTextStyle(Text.TextStyle.underline),
                                new Text("כשכופלים מספר במשתנה או משתנה במשתנה, לא משתמשים בסימן הכפל"),
                                new Formula("$$2\\times x = 2x$$"),
                                new Formula("$$x\\times y = xy$$")
                        }),
                        new Topic("כינוס איברים דומים", R.drawable.ic_simplifying, new Item[]{
                                new Text("איבר: מכפלה או מנה של מספרים ומשתנים. בין איברים יש חיבור וחיסור"),
                                new Text("אם יש בביטוי כמה איברים שהם מכפלות של מספר במשתנה, ניתן לחבר אותם, כמו בדוגמא הבאה:"),
                                new Formula("$$2x+5x = 7x$$"),
                                new Text("ניתן לעשות זאת מספר פעמים:"),
                                new Formula("$$4x+8y+7+12y+2x+8=6x+20y+15$$")
                        }),
                        new Topic("פתיחת סוגריים", R.drawable.ic_parenthesis_opening, new Item[]{
                                new Text("ראינו כבר שעל פי סדר פעולות חשבון, מחשבים בראש ובראשונה ביטוי הכתוב בתוך סוגריים. אך לפעמים, אם הביטוי כולל נעלם, אנחנו לא יכולים לחשב אותו בלי להיפטר מהסוגריים. ישנם כמה מקרים בהם נרצה להיפטר מהסוגריים, ההבדל ביניהם הוא מה בא לפני הסוגריים:"),
                                new Text("חיבור:").setTextStyle(Text.TextStyle.underline),
                                new Text("בחיבור ניתן פשוט להתעלם מהסוגריים."),
                                new Formula("$$...+(a+b)=...+a+b$$"),
                                new Text("חיסור:").setTextStyle(Text.TextStyle.underline),
                                new Text("בחיסור כדי להיפטר מהסגוריים יש להפוך את הסימן של כל איבר בתוכם."),
                                new Formula("$$...-(a+b-c)=...-a-b+c$$"),
                                new Text("מכפלה בגורם:").setTextStyle(Text.TextStyle.underline),
                                new Text("אם כופלים סוגריים בגורם צריך להכפיל כל איבר בתוך הסוגריים בגורם שכופל את הסוגריים כדי להיפטר מהם."),
                                new Formula("$$...a(b-c)=ab-ac$$"),
                                new Text("חלוקה בגורם:").setTextStyle(Text.TextStyle.underline),
                                new Text("אם מחלקים סוגריים בגורם צריך לחלק כל איבר בתוך הסוגריים בגורם שבמכנה כדי להיפטר מהם."),
                                new Formula("$$\\frac{ax+ay}{a}=x+y$$"),
                                new Text("מכפלת סוגריים").setTextStyle(Text.TextStyle.underline),
                                new Text("אם יש מכפלת סוגריים, כדי להיפטר מהסוגריים צריך לכפול כל אחד מהאיברים בסוגריים הראשונים בכל אחד מהאיברים בסוגריים השניים."),
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
