package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dins extends deup {
    private final deup d;
    private final Object e;

    public dins(deup deupVar, String str, Object obj) {
        super(str, obj);
        this.d = deupVar;
        this.e = obj;
    }

    public static deup c(String str, Integer num) {
        return new dins(new deum(str, num), str, num);
    }

    public static deup d(String str, String str2) {
        return new dins(new deun(str, str2), str, str2);
    }

    public static deup e(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        return new dins(new deul(str, valueOf), str, valueOf);
    }

    @Override // defpackage.deup
    public final Object a() {
        try {
            return this.d.a();
        } catch (Throwable unused) {
            return this.e;
        }
    }
}
