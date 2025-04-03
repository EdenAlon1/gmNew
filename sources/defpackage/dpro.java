package defpackage;

import android.content.res.AssetFileDescriptor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpro extends ffhv implements ffjm {
    final /* synthetic */ AssetFileDescriptor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpro(AssetFileDescriptor assetFileDescriptor, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = assetFileDescriptor;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpro) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.close();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpro(this.a, ffguVar);
    }
}
