package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nra implements mim {
    private final ntg a = new ntg();
    private final boolean b;
    private final npm c;
    private final int d;
    private final npc e;

    public nra(boolean z, npm npmVar, int i, npc npcVar) {
        this.b = z;
        this.c = npmVar;
        this.d = i;
        this.e = npcVar;
    }

    @Override // defpackage.mim
    public final mig[] b(Handler handler, mgi mgiVar, mgi mgiVar2, mgi mgiVar3, mgi mgiVar4) {
        ArrayList arrayList = new ArrayList();
        if (!this.b) {
            arrayList.add(new nqu(this.c, this.a, this.e));
        }
        arrayList.add(new nqw(this.c, this.d, this.a, this.e));
        return (mig[]) arrayList.toArray(new mig[arrayList.size()]);
    }

    @Override // defpackage.mim
    public final /* synthetic */ void a(mig migVar) {
    }
}
