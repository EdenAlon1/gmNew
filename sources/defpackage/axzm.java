package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axzm extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ axzp d;
    final /* synthetic */ axzn e;
    final /* synthetic */ ceuw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axzm(axzp axzpVar, axzn axznVar, ceuw ceuwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = axzpVar;
        this.e = axznVar;
        this.f = ceuwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axzm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [ecri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Exception e;
        Object obj2;
        ceyt m;
        ecri ecriVar;
        Object obj3 = ffhh.a;
        ?? r1 = this.c;
        try {
            if (r1 != 0) {
                obj2 = this.b;
                r1 = this.a;
                try {
                    ffci.b(obj);
                    r1 = r1;
                } catch (Exception e2) {
                    e = e2;
                    obj2 = ecrh.ERROR;
                    Object b = this.e.e.b();
                    b.getClass();
                    axuo.a((akzt) b, 6);
                    if (((Boolean) axum.h.e()).booleanValue() || (((Boolean) axum.k.e()).booleanValue() && !(((Boolean) axum.k.e()).booleanValue() && axuv.a(e)))) {
                        this.e.k(this.d);
                        throw e;
                    }
                    ((ensz) ((ensz) axzn.a.e()).g(e)).q("Caught exception while batch syncing deletions. Marking WorkQueueResult as failedRetry.");
                    if (!this.f.c()) {
                        this.e.k(this.d);
                    }
                    m = ceyt.m();
                    ecriVar = r1;
                    ((ecrj) this.e.f.b()).f(ecriVar, axup.e, null, (ecrh) obj2);
                    return m;
                }
            } else {
                ffci.b(obj);
                ensz enszVar = (ensz) axzn.a.h();
                axzp axzpVar = this.d;
                enszVar.u("Syncing deletions for import, batch %d / %d", axzpVar.c, axzpVar.d);
                r1 = ((ecrj) this.e.f.b()).d();
                ecrh ecrhVar = ecrh.SUCCESS;
                try {
                    axwk axwkVar = (axwk) this.e.b.b();
                    eygl eyglVar = this.d.b;
                    eyglVar.getClass();
                    this.a = r1;
                    this.b = ecrhVar;
                    this.c = 1;
                    Object k = axwkVar.k(eyglVar, this);
                    if (k == obj3) {
                        return obj3;
                    }
                    obj2 = ecrhVar;
                    obj = k;
                    r1 = r1;
                } catch (Exception e3) {
                    e = e3;
                    obj2 = ecrh.ERROR;
                    Object b2 = this.e.e.b();
                    b2.getClass();
                    axuo.a((akzt) b2, 6);
                    if (((Boolean) axum.h.e()).booleanValue()) {
                    }
                    this.e.k(this.d);
                    throw e;
                } catch (Throwable th) {
                    obj3 = ecrhVar;
                    th = th;
                    ((ecrj) this.e.f.b()).f((ecri) r1, axup.e, null, (ecrh) obj3);
                    throw th;
                }
            }
            List list = (List) obj;
            eygl eyglVar2 = this.d.b;
            eyglVar2.getClass();
            ArrayList<Long> arrayList = new ArrayList();
            int i = 0;
            for (Object obj4 : eyglVar2) {
                int i2 = i + 1;
                if (i < 0) {
                    ffdx.l();
                }
                if (!((Boolean) list.get(i)).booleanValue()) {
                    arrayList.add(obj4);
                }
                i = i2;
            }
            ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
            for (Long l : arrayList) {
                aydg aydgVar = (aydg) aydh.a.createBuilder();
                l.getClass();
                long longValue = l.longValue();
                aydgVar.copyOnWrite();
                ((aydh) aydgVar.instance).b = longValue;
                long epochMilli = Instant.EPOCH.toEpochMilli();
                aydgVar.copyOnWrite();
                ((aydh) aydgVar.instance).c = epochMilli;
                arrayList2.add((aydh) aydgVar.build());
            }
            axzn axznVar = this.e;
            axzp axzpVar2 = this.d;
            fffs fffsVar = new fffs((byte[]) null);
            if (ffdx.at(arrayList2)) {
                aydr aydrVar = (aydr) ayds.a.createBuilder();
                aydrVar.a(arrayList2);
                aydrVar.copyOnWrite();
                ayds aydsVar = (ayds) aydrVar.instance;
                aydsVar.e = ayec.a(6);
                aydsVar.b = 1 | aydsVar.b;
                fffsVar.add(ceyr.g("contact_recipient_deleted_sync", (ayds) aydrVar.build()));
            }
            if (axzpVar2.c == axzpVar2.d) {
                fffsVar.add(ceyr.g("schedule_contacts_import", eyex.a));
            }
            m = ceyt.j(engq.a(ffdx.a(fffsVar)));
            ecriVar = r1;
            ((ecrj) this.e.f.b()).f(ecriVar, axup.e, null, (ecrh) obj2);
            return m;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axzm(this.d, this.e, this.f, ffguVar);
    }
}
