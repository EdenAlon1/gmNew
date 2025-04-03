package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drjx implements drka<drjx, drkb> {
    private static final drlr a;
    public static final /* synthetic */ int b = 0;
    private final String d;

    static {
        new drju("*");
        a = drlr.a;
    }

    public drjx(String str) {
        this.d = str;
    }

    @Override // defpackage.drka
    public String a() {
        return this.d;
    }

    @Override // defpackage.drka
    public final drlw b() {
        return a;
    }

    @Override // defpackage.drka
    public final /* synthetic */ drlx c() {
        return drjy.a(this);
    }
}
