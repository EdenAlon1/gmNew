package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class obd extends ffkk implements ffix {
    final /* synthetic */ oam a;
    final /* synthetic */ ea b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obd(oam oamVar, ea eaVar) {
        super(0);
        this.a = oamVar;
        this.b = eaVar;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        oam oamVar = this.a;
        for (nxm nxmVar : (Iterable) oamVar.g.c()) {
            if (obl.l()) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + nxmVar + " due to fragment " + this.b + " viewmodel being cleared");
            }
            oamVar.d(nxmVar);
        }
        return ffcu.a;
    }
}
