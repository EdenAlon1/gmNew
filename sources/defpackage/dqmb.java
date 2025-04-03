package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmb implements dqmi {
    private static final enru a = enru.c("com/google/android/libraries/compose/draft/attachments/ManagedDraftAttachmentsController");
    private final Activity b;
    private final dqlu c;
    private final ffbz d;

    public dqmb(Activity activity, dqlu dqluVar, final fazb fazbVar) {
        this.b = activity;
        this.c = dqluVar;
        this.d = ffca.a(new ffix() { // from class: dqly
            @Override // defpackage.ffix
            public final Object invoke() {
                return ((dqmc) fazb.this).a;
            }
        });
    }

    private final dqlv i(doxs doxsVar) {
        ffji ffjiVar = new ffji() { // from class: dqlz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Class cls = (Class) obj;
                cls.getClass();
                Object obj2 = dqmb.this.g().get(cls);
                if (obj2 instanceof dqlv) {
                    return (dqlv) obj2;
                }
                return null;
            }
        };
        doxsVar.getClass();
        return (dqlv) ffno.f(ffno.j(new ffnp(new doxv(doxsVar.getClass(), null)), ffjiVar));
    }

    private final boolean j(doxs doxsVar) {
        List a2 = this.c.a();
        if ((a2 instanceof Collection) && a2.isEmpty()) {
            return false;
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            if (doxw.a((doxs) it.next(), doxsVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.dqlx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.doxs r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqmb.a(doxs, ffgu):java.lang.Object");
    }

    @Override // defpackage.dqlx
    public final void b() {
        Iterator it = g().values().iterator();
        while (it.hasNext()) {
            ((dqlv) it.next()).b();
        }
        this.c.b();
    }

    @Override // defpackage.dqlx
    public final void c() {
        for (doxs doxsVar : this.c.a()) {
            dqlv i = i(doxsVar);
            if (i != null) {
                i.c(doxsVar);
            }
        }
        this.c.b();
    }

    @Override // defpackage.dqlx
    public final void d(doxs doxsVar) {
        doxsVar.getClass();
        if (!j(doxsVar)) {
            ((enrr) a.i().h("com/google/android/libraries/compose/draft/attachments/ManagedDraftAttachmentsController", "removeAttachment", 74, "ManagedDraftAttachmentsController.kt")).t("Skipping removal of %s, which wasn't added", doxsVar);
            return;
        }
        dqlv i = i(doxsVar);
        if (i != null) {
            i.d(doxsVar);
        }
        dqlu dqluVar = this.c;
        List a2 = dqluVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a2) {
            if (!doxw.a((doxs) obj, doxsVar)) {
                arrayList.add(obj);
            }
        }
        dqluVar.a.h(arrayList);
    }

    @Override // defpackage.dqlx
    public final /* bridge */ /* synthetic */ void e(doxs doxsVar) {
        throw new UnsupportedOperationException("send() should be implemented by client DraftAttachmentsController and is unsupported in ManagedDraftAttachmentsController");
    }

    @Override // defpackage.dqlx
    public final /* synthetic */ boolean f() {
        return dqlw.a();
    }

    public final Map g() {
        return (Map) this.d.a();
    }

    @Override // defpackage.dqmi
    public final fgdj h() {
        return this.c.b;
    }
}
