package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsla extends ffhv implements ffjm {
    int a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsla(View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsla) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final ffxe ffxeVar = (ffxe) this.c;
            final View view = this.b;
            if (view.isLaidOut()) {
                ffxeVar.b(view);
            }
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: dsky
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    ffxe.this.b(view);
                }
            };
            this.b.addOnLayoutChangeListener(onLayoutChangeListener);
            final View view2 = this.b;
            ffix ffixVar = new ffix() { // from class: dskz
                @Override // defpackage.ffix
                public final Object invoke() {
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
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
        dsla dslaVar = new dsla(this.b, ffguVar);
        dslaVar.c = obj;
        return dslaVar;
    }
}
