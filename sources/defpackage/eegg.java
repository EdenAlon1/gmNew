package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegg extends eegp {
    public final int a;
    public final String b;

    public eegg(String str, int i, String str2) {
        super(str);
        this.a = i;
        this.b = str2;
    }

    static eegg a(eegp eegpVar, int i, String str) {
        String f = eegpVar.f();
        String d = eegpVar.d();
        if (f == null || d == null) {
            throw new eefw("Can't build a response for a message without to & from headers");
        }
        eegg eeggVar = new eegg(eegpVar.d, i, str);
        eeggVar.g("To-Path", d);
        eeggVar.g("From-Path", f);
        return eeggVar;
    }
}
