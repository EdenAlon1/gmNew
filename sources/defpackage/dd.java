package defpackage;

import android.util.Log;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dd extends ffkk implements ffix {
    final /* synthetic */ de a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ Object c;
    final /* synthetic */ fflb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(de deVar, ViewGroup viewGroup, Object obj, fflb fflbVar) {
        super(0);
        this.a = deVar;
        this.b = viewGroup;
        this.c = obj;
        this.d = fflbVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        de deVar = this.a;
        deVar.f = deVar.d.s(this.b, this.c);
        de deVar2 = this.a;
        Object obj = this.c;
        ViewGroup viewGroup = this.b;
        if (deVar2.f == null) {
            throw new IllegalStateException("Unable to start transition " + obj + " for container " + viewGroup + '.');
        }
        this.d.a = new dc(deVar2, obj, viewGroup);
        if (fr.af(2)) {
            Log.v("FragmentManager", "Started executing operations from " + this.a.b + " to " + this.a.c);
        }
        return ffcu.a;
    }
}
