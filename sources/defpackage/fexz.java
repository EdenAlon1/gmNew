package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fexz extends feik {
    public static final fhmt a = new fhmt();
    public final febs b;
    public final String c;
    public final fevo d;
    public final String e;
    public final fexy f;
    public final boolean g;
    private final fexx h;
    private final fdxd i;

    public fexz(febs febsVar, febo feboVar, fexm fexmVar, feyg feygVar, feyu feyuVar, Object obj, int i, int i2, String str, String str2, fevo fevoVar, fevw fevwVar, fdxj fdxjVar) {
        super(new feyp(), fevoVar, fevwVar, feboVar, fdxjVar);
        this.h = new fexx(this);
        this.g = false;
        this.d = fevoVar;
        this.b = febsVar;
        this.e = str;
        this.c = str2;
        this.i = feygVar.o;
        this.f = new fexy(this, i, fevoVar, obj, fexmVar, feyuVar, feygVar, i2);
    }

    @Override // defpackage.fejs
    public final fdxd a() {
        return this.i;
    }

    @Override // defpackage.feik
    protected final /* synthetic */ feih p() {
        return this.h;
    }

    @Override // defpackage.feik
    protected final /* synthetic */ feij q() {
        return this.f;
    }

    @Override // defpackage.feik, defpackage.feio
    protected final /* synthetic */ fein r() {
        return this.f;
    }

    public final febr s() {
        return this.b.a;
    }
}
