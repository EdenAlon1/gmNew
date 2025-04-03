package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpqw extends ffhv implements ffjm {
    final /* synthetic */ fflb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpqw(fflb fflbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpqw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        OutputStream outputStream = (OutputStream) this.a.a;
        if (outputStream == null) {
            return null;
        }
        outputStream.close();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpqw(this.a, ffguVar);
    }
}
