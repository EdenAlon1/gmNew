package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxt implements dcag, dbzu, dcaf {
    private dbzn b;
    private final ContentGridView e;
    private final List c = new ArrayList();
    private boolean d = false;
    public final List a = new ArrayList();

    private dbxt(ContentGridView contentGridView) {
        this.e = contentGridView;
    }

    public static dbxt i(ContentGridView contentGridView) {
        dbxt dbxtVar = new dbxt(contentGridView);
        contentGridView.ad = new dbxs(dbxtVar);
        contentGridView.am(contentGridView.ad);
        contentGridView.x(new dbxu());
        contentGridView.ad.m(contentGridView.ac);
        return dbxtVar;
    }

    private static void k(Iterable iterable, dbzn dbznVar) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((dcae) it.next()).v(dbznVar);
        }
    }

    @Override // defpackage.dcag
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.dcag
    public final dcae b(int i) {
        return (dcae) this.a.get(i);
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        dbzn dbznVar = this.b;
        if (dbznVar != null) {
            k(list, dbznVar);
        }
        List list2 = this.a;
        int size = list2.size();
        list2.addAll(list);
        this.e.aP(size, list.size());
    }

    public final void d(cxqz cxqzVar) {
        this.c.add(cxqzVar);
    }

    @Override // defpackage.dbzu
    public final void e(AttachmentQueueState attachmentQueueState) {
        f();
    }

    public final void f() {
        if (this.d || this.c.isEmpty()) {
            return;
        }
        try {
            this.d = true;
            for (cxqz cxqzVar : this.c) {
                for (dcae dcaeVar : this.a) {
                    if (dcaeVar.d().contains(Integer.valueOf(cxqzVar.a))) {
                        dcaeVar.f(cxqzVar);
                    }
                }
            }
            this.c.clear();
        } finally {
            this.d = false;
        }
    }

    public final void g(CustomizationModel customizationModel, dcaw dcawVar, boolean z) {
        EnumMap enumMap = new EnumMap(eymn.class);
        for (dcae dcaeVar : this.a) {
            enumMap.put((EnumMap) dcaeVar.h, (eymn) dcaeVar);
        }
        this.a.clear();
        List c = dcawVar.c(customizationModel, enumMap, z);
        dbzn dbznVar = this.b;
        if (dbznVar != null) {
            k(c, dbznVar);
        }
        this.a.addAll(c);
        this.e.aP(0, c.size());
    }

    public final void h(dbzn dbznVar) {
        this.b = dbznVar;
        k(this.a, dbznVar);
    }

    @Override // defpackage.dbzu
    public final /* synthetic */ void j() {
    }
}
