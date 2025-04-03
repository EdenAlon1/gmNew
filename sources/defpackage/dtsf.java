package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtsf extends duaw {
    public final String d;
    public final String e;
    public final String f;

    protected dtsf(String str) {
        String str2;
        this.d = str;
        int indexOf = str.indexOf(".");
        if (indexOf >= 0) {
            this.f = str.substring(indexOf + 1);
            str2 = str.substring(0, indexOf);
        } else {
            this.f = str;
            str2 = null;
        }
        this.e = str2;
    }

    @Override // defpackage.duaw
    public void e(dtse dtseVar) {
        dtseVar.b(this.d, null);
    }

    public final String f(dtyo dtyoVar) {
        String str = this.e;
        if (str == null) {
            return this.f;
        }
        Object apply = dtyoVar.apply(str);
        return ((String) apply) + "." + this.f;
    }
}
