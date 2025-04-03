package defpackage;

import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdp extends fgwo {
    private static final long serialVersionUID = -3273944031884755345L;
    private String c;
    private String d;
    private String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdp() {
        super("REQUEST-STATUS");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.c;
        if (str != null) {
            stringBuffer.append(str);
        }
        if (this.d != null) {
            stringBuffer.append(';');
            stringBuffer.append(this.d);
        }
        if (this.e != null) {
            stringBuffer.append(';');
            stringBuffer.append(this.e);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        if (stringTokenizer.hasMoreTokens()) {
            this.c = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreTokens()) {
            this.d = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreTokens()) {
            this.e = stringTokenizer.nextToken();
        }
    }
}
