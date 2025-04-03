package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulx implements dqlv, uic {
    private final uco a;
    private final uot b;
    private final Supplier c;

    public ulx(uco ucoVar, uot uotVar, Supplier supplier) {
        this.a = ucoVar;
        this.b = uotVar;
        this.c = supplier;
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        Object obj;
        MessagePartCoreData a;
        Object obj2;
        dsci dsciVar = (dsci) doxsVar;
        obj = this.c.get();
        ugx e = ((ugl) obj).e();
        drem dremVar = (drem) drma.c(dsciVar, new drkd(((Boolean) uky.d.e()).booleanValue() && e.b(), false), new Long(e.a()));
        String str = dremVar.b;
        drld drldVar = dremVar.a;
        Uri parse = Uri.parse(str);
        String a2 = drjy.a(drldVar).a();
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        eptqVar.getClass();
        eqni.b(epts.STICKER, eptqVar);
        eqni.c(eptu.EXPANDED, eptqVar);
        eptv a3 = eqni.a(eptqVar);
        dcle dcleVar = dcle.a;
        int i = dclf.b;
        dclg dclgVar = new dclg(a3);
        if (((Boolean) cful.o.e()).booleanValue()) {
            uco ucoVar = this.a;
            uel uelVar = new uel();
            uelVar.e(parse);
            uelVar.c(a2);
            uelVar.a = new Size(dremVar.c, dremVar.d);
            uelVar.d(dsciVar.a);
            uelVar.b(eohh.STICKER_CHOOSER);
            a = ucoVar.a(uelVar.a(), dclgVar);
        } else {
            a = this.b.a(new ExpressiveStickerContentItem(parse, a2, dremVar.c, dremVar.d, dsciVar.a, eohh.STICKER_CHOOSER), dclgVar);
        }
        obj2 = this.c.get();
        ((ugl) obj2).c(a);
        return dqmj.a;
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void c(doxs doxsVar) {
        ((dsci) doxsVar).getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
    }

    @Override // defpackage.uic
    public final /* synthetic */ ffji h() {
        return ulw.a;
    }

    @Override // defpackage.uic
    public final boolean i(MessagePartCoreData messagePartCoreData) {
        messagePartCoreData.getClass();
        return (messagePartCoreData.bl() || messagePartCoreData.bj()) && messagePartCoreData.N() == eohh.STICKER_CHOOSER;
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void b() {
    }
}
