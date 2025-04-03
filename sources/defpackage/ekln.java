package defpackage;

import android.os.Looper;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekln extends lml implements ljv {
    public final Map a = new cmh(2);
    public boolean b = false;
    public lkr c = null;
    private final Map d = new cmh();
    private boolean e = false;

    private final void l(lkr lkrVar) {
        emxf.l(Looper.getMainLooper().getThread() == Thread.currentThread());
        Set set = (Set) this.a.remove(lkrVar);
        emxf.m(set != null, "A LifecycleOwner was destroyed that was never observed, or was destroyed twice.");
        this.e = true;
        if (lkrVar == this.c) {
            this.c = null;
        }
        Set keySet = this.d.keySet();
        keySet.getClass();
        set.getClass();
        enpr enprVar = new enpr(keySet, set);
        emxf.p(enprVar.isEmpty(), "This lifecycle didn't call getOrCreate() for the following IDs: %s Each value must be retrieved exactly once each lifecycle, before the Lifecycle reaches STARTED. Is the calling code conditionally memoizing a value?", enprVar);
    }

    @Override // defpackage.lml
    public final void fD() {
        for (eklm eklmVar : this.d.values()) {
            eklmVar.b.a(eklmVar.a);
        }
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        l(lkrVar);
        lkrVar.P().d(this);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        l(lkrVar);
        lkrVar.P().d(this);
    }

    public final Object k(int i, lkr lkrVar, ekll ekllVar, eklk eklkVar) {
        emxf.l(Looper.getMainLooper().getThread() == Thread.currentThread());
        lkj a = lkrVar.P().a();
        emxf.p(a == lkj.INITIALIZED, "Values may only be accessed during the INITIALIZED part of the LifecycleOwner's lifecycle. Each lifecycle must call getOrCreate() for each and only each value that the first LifecycleOwner instance called getOrCreate() for, exactly once. The current lifecycle state is %s", a);
        if (this.e) {
            Set set = (Set) this.a.get(lkrVar);
            Integer valueOf = Integer.valueOf(i);
            emxf.n(set.add(valueOf), "A value for idRes %s has already been gotten. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
            emxf.n(this.d.containsKey(valueOf), "The first lifecycle didn't create a value for idRes %s. Is the LifecycleOwner accessing this value inside a conditional?", i);
            return ((eklm) this.d.get(valueOf)).a;
        }
        emxf.m(lkrVar == this.c, "A second Lifecycle started before the first lifecycle either started or was destroyed. This breaks a boundary condition assumption in TikTok. Please report it as a bug and include reproduction steps and a stack trace.");
        Object a2 = ekllVar.a();
        Map map = this.d;
        Integer valueOf2 = Integer.valueOf(i);
        emxf.n(map.put(valueOf2, new eklm(a2, eklkVar)) == null, "Input id %s was previously used. Each ID must be used exactly once each lifecycle.", i);
        emxf.n(((Set) this.a.get(lkrVar)).add(valueOf2), "A value was previously created for idRes %s. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
        return a2;
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }
}
