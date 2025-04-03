package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayxv extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ayxw c;
    final /* synthetic */ ffix d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayxv(ayxw ayxwVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ayxwVar;
        this.d = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayxv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ?? r0;
        ekzz ekzzVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        if (i == 0) {
            ffci.b(obj);
            ayxw ayxwVar = this.c;
            ekzz f = eleg.f("logAllDuplicateConversations");
            try {
                this.a = f;
                this.b = 2;
                if (ayxwVar.a(this) == ffhhVar) {
                    return ffhhVar;
                }
                ekzzVar = f;
            } catch (Throwable th) {
                th = th;
                r0 = f;
                throw th;
            }
        } else if (i != 1) {
            r0 = this.a;
            try {
                ffci.b(obj);
                ekzzVar = r0;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ffig.a(r0, th);
                    throw th3;
                }
            }
        } else {
            ?? r02 = this.a;
            try {
                ffci.b(obj);
                ffig.a(r02, null);
                return this.d.invoke();
            } finally {
            }
        }
        ffig.a(ekzzVar, null);
        return this.d.invoke();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ayxv(this.c, this.d, ffguVar);
    }
}
