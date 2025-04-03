package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcba {
    public final CustomizationModel a;
    private final List b;
    private final ctyx c;

    /* JADX WARN: Multi-variable type inference failed */
    public dcba(ctyx ctyxVar, enhk enhkVar) {
        this.c = ctyxVar;
        CustomizationModel customizationModel = new CustomizationModel();
        this.a = customizationModel;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(enhkVar.keySet());
        arrayList.remove(eymn.CAMERA_GALLERY);
        boolean z = ((Boolean) cful.c.e()).booleanValue() && !uky.c();
        boolean z2 = ((Boolean) cful.f.e()).booleanValue() && !uky.d();
        boolean booleanValue = ((Boolean) cful.V.e()).booleanValue();
        boolean booleanValue2 = ((Boolean) cful.g.e()).booleanValue();
        if (!z) {
            arrayList.remove(eymn.GIF);
        }
        if (!z2) {
            arrayList.remove(eymn.EXPRESSIVE_STICKER);
        }
        if (booleanValue) {
            arrayList.remove(eymn.GALLERY);
        }
        if (booleanValue2) {
            arrayList.remove(eymn.EMOJI);
        }
        if (!arrayList.contains(eymn.CUSTOMIZATION)) {
            if (d()) {
                b();
            }
            c();
            return;
        }
        if (!((Boolean) cful.b.e()).booleanValue()) {
            if (d()) {
                b();
            }
            c();
            return;
        }
        byte[] r = ctyxVar.r("c2o_category_order");
        if (r == null) {
            c();
            return;
        }
        try {
            customizationModel.a.clear();
            customizationModel.a.addAll(((eymr) ((eymm) ((eymm) eymr.a.createBuilder()).mergeFrom(r)).build()).b);
        } catch (eygu unused) {
            csjy.f("Bugle", "CategoryOrderUtil: Cannot re-create category order from preferences. Reloading default order");
            b();
            c();
        }
        if (this.a.a() == this.b.size()) {
            return;
        }
        b();
        c();
    }

    private final void b() {
        this.c.n("c2o_category_order");
    }

    private final void c() {
        int size = this.b.size();
        eymq[] eymqVarArr = new eymq[size];
        Arrays.fill(eymqVarArr, eymq.VISIBLE);
        List list = this.b;
        int size2 = list.size();
        boolean[] zArr = new boolean[size2];
        for (int i = 0; i < list.size(); i++) {
            zArr[i] = CustomizationModel.e(this.c, (eymn) list.get(i), null, false);
        }
        CustomizationModel customizationModel = this.a;
        List list2 = this.b;
        customizationModel.a.clear();
        csix.a(list2.size(), size);
        csix.a(list2.size(), size2);
        eymo createBuilder = eymp.a.createBuilder();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            eymn eymnVar = (eymn) list2.get(i2);
            createBuilder.copyOnWrite();
            ((eymp) createBuilder.instance).b = eymnVar.a();
            eymq eymqVar = eymqVarArr[i2];
            createBuilder.copyOnWrite();
            ((eymp) createBuilder.instance).c = eymqVar.a();
            boolean z = zArr[i2];
            createBuilder.copyOnWrite();
            ((eymp) createBuilder.instance).d = z;
            customizationModel.a.add(createBuilder.build());
        }
        customizationModel.c();
    }

    private final boolean d() {
        return this.c.p("c2o_category_order");
    }

    public final void a(CustomizationModel customizationModel) {
        csix.l(customizationModel);
        CustomizationModel customizationModel2 = this.a;
        customizationModel2.a.clear();
        customizationModel2.a.addAll(customizationModel.a);
        customizationModel2.c();
        eymm eymmVar = (eymm) eymr.a.createBuilder();
        eymmVar.a(this.a.a);
        this.c.i("c2o_category_order", ((eymr) eymmVar.build()).toByteArray());
    }
}
