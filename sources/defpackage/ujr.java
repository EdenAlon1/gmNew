package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujr implements dqlv, uic {
    private final uco a;
    private final uot b;
    private final Supplier c;

    public ujr(uco ucoVar, uot uotVar, Supplier supplier) {
        this.a = ucoVar;
        this.b = uotVar;
        this.c = supplier;
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        Object obj;
        MessagePartCoreData a;
        Object obj2;
        drcr drcrVar = (drcr) doxsVar;
        obj = this.c.get();
        ugx e = ((ugl) obj).e();
        drem dremVar = (drem) drma.c(drcrVar, new drkd(((Boolean) uky.d.e()).booleanValue() && e.b(), false), new Long(e.a()));
        Uri parse = Uri.parse(dremVar.b);
        String host = parse.getHost();
        host.getClass();
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        eptqVar.getClass();
        eqni.b(epts.GIF, eptqVar);
        eqni.c(eptu.EXPANDED, eptqVar);
        eptv a2 = eqni.a(eptqVar);
        dcle dcleVar = dcle.a;
        int i = dclf.b;
        dclg dclgVar = new dclg(a2);
        if (((Boolean) cful.o.e()).booleanValue()) {
            uco ucoVar = this.a;
            ufl h = ufm.h();
            h.e(parse);
            uer uerVar = (uer) h;
            uerVar.b = parse;
            h.d(host);
            h.b(eohh.GIF_CHOOSER);
            h.c(drjy.a(dremVar.a).a());
            uerVar.a = new Size(dremVar.c, dremVar.d);
            a = ucoVar.a(h.a(), dclgVar);
        } else {
            a = this.b.a(new GifContentItem(parse, parse, parse, host, drcrVar.b, drcrVar.a, dremVar.c, dremVar.d), dclgVar);
        }
        obj2 = this.c.get();
        ((ugl) obj2).c(a);
        return dqmj.a;
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void c(doxs doxsVar) {
        ((drcr) doxsVar).getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
    }

    @Override // defpackage.uic
    public final /* synthetic */ ffji h() {
        return ujq.a;
    }

    @Override // defpackage.uic
    public final boolean i(MessagePartCoreData messagePartCoreData) {
        messagePartCoreData.getClass();
        return messagePartCoreData.bl() && messagePartCoreData.N() == eohh.GIF_CHOOSER;
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void b() {
    }
}
