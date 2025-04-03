package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejmo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ejmp b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejmo(ejmp ejmpVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ejmpVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejmo) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final ffxe ffxeVar = (ffxe) this.d;
            final ejmq ejmqVar = new ejmq(new ffjm() { // from class: ejmm
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    if (((Boolean) obj2).booleanValue()) {
                        throw new IllegalStateException("This ContentObserver should not propagate changes itself.");
                    }
                    if (ffws.c(ffxe.this.b(ffcu.a))) {
                        return ffcu.a;
                    }
                    throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
                }
            });
            ejmp ejmpVar = this.b;
            ejmpVar.a.registerContentObserver(this.c, true, ejmqVar);
            if (!ffws.c(ffxeVar.b(ffcu.a))) {
                throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
            }
            final ejmp ejmpVar2 = this.b;
            ffix ffixVar = new ffix() { // from class: ejmn
                @Override // defpackage.ffix
                public final Object invoke() {
                    ejmp.this.a.unregisterContentObserver(ejmqVar);
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (ffxd.b(ffxeVar, ffixVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejmo ejmoVar = new ejmo(this.b, this.c, ffguVar);
        ejmoVar.d = obj;
        return ejmoVar;
    }
}
