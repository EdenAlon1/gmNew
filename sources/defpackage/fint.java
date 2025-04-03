package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fint extends fiqt {
    public static final Pattern[][] a = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    private final Pattern c;
    private final fipq b = new fipq();
    private boolean d = false;
    private find e = new find();

    public fint(Pattern pattern) {
        this.c = pattern;
    }

    @Override // defpackage.fiqw
    public final fipf b() {
        return this.b;
    }

    @Override // defpackage.fiqw
    public final fiqv c(fiqz fiqzVar) {
        if (this.d) {
            return null;
        }
        finn finnVar = (finn) fiqzVar;
        if (finnVar.h && this.c == null) {
            return null;
        }
        return new fine(finnVar.d, -1, false);
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final void d(fiqr fiqrVar) {
        find findVar = this.e;
        if (findVar.b != 0) {
            findVar.a.append('\n');
        }
        findVar.a.append(fiqrVar.a);
        findVar.b++;
        Pattern pattern = this.c;
        if (pattern == null || !pattern.matcher(fiqrVar.a).find()) {
            return;
        }
        this.d = true;
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final void k() {
        StringBuilder sb = this.e.a;
        this.e = null;
    }
}
