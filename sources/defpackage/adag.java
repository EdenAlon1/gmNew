package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adag implements Consumer {
    final /* synthetic */ adaj a;
    final /* synthetic */ String b;

    public adag(adaj adajVar, String str) {
        this.a = adajVar;
        this.b = str;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* synthetic */ void o(Object obj) {
        buco bucoVar = (buco) obj;
        cmrl n = bucoVar.n();
        draj drajVar = null;
        if (n != null) {
            draj drajVar2 = n.b == 101 ? (draj) n.c : draj.a;
            if (drajVar2 != null) {
                ((ensz) adaj.a.h()).t("Found an Emotify reaction by messageId(uri = %s).", adaj.a(drajVar2).toString());
                if (true != ffkj.e(adaj.a(drajVar2).getAuthority(), "com.google.android.libraries.compose.core.data.content")) {
                    drajVar2 = null;
                }
                if (drajVar2 != null) {
                    String str = this.b;
                    drai draiVar = (drai) drajVar2.toBuilder();
                    draiVar.getClass();
                    droo drooVar = ((draj) draiVar.instance).g;
                    if (drooVar == null) {
                        drooVar = droo.a;
                    }
                    drooVar.getClass();
                    drnu drnuVar = (drnu) drooVar.toBuilder();
                    drnuVar.getClass();
                    doyi doyiVar = ((droo) drnuVar.instance).f;
                    if (doyiVar == null) {
                        doyiVar = doyi.a;
                    }
                    doyiVar.getClass();
                    doye doyeVar = (doye) doyiVar.toBuilder();
                    doyeVar.getClass();
                    doyj.b(str, doyeVar);
                    dros.b(doyj.a(doyeVar), drnuVar);
                    drak.b(dros.a(drnuVar), draiVar);
                    drajVar = drak.a(draiVar);
                }
            }
        }
        if (drajVar == null) {
            ((ensz) adaj.a.j()).q("This reaction is not qualified to update.");
            return;
        }
        ((ensz) adaj.a.h()).t("Found an Emotify reaction to update(uri = %s).", adaj.a(drajVar).toString());
        cmrl n2 = bucoVar.n();
        if (n2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        cmrk cmrkVar = (cmrk) n2.toBuilder();
        cmrkVar.getClass();
        cmru.b(drajVar, cmrkVar);
        final adaj adajVar = this.a;
        final cmrl a = cmru.a(cmrkVar);
        final MessageIdType l = bucoVar.l();
        l.getClass();
        bueg.f(l, new Consumer() { // from class: adad
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                eygr eygrVar;
                cmre cmreVar;
                buco bucoVar2 = (buco) obj2;
                cmrf m = bucoVar2.m();
                if (m == null || (eygrVar = m.b) == null) {
                    return;
                }
                int i = 0;
                for (Object obj3 : eygrVar) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ffdx.l();
                    }
                    cmro cmroVar = (cmro) obj3;
                    cmrl cmrlVar = cmroVar.c;
                    if (cmrlVar == null) {
                        cmrlVar = cmrl.a;
                    }
                    cmrlVar.getClass();
                    cmrf cmrfVar = null;
                    draj drajVar3 = cmrlVar.b == 101 ? (draj) cmrlVar.c : null;
                    if (drajVar3 != null) {
                        cmrl cmrlVar2 = cmrl.this;
                        if (!ffkj.e(drajVar3.c, (cmrlVar2.b == 101 ? (draj) cmrlVar2.c : draj.a).c) || !ffkj.e(adaj.a(drajVar3).getAuthority(), "com.google.android.libraries.compose.core.data.content")) {
                            drajVar3 = null;
                        }
                        if (drajVar3 != null) {
                            cmroVar.getClass();
                            cmrn cmrnVar = (cmrn) cmroVar.toBuilder();
                            cmrnVar.getClass();
                            cmrp.b(cmrlVar2, cmrnVar);
                            cmro a2 = cmrp.a(cmrnVar);
                            cmrf m2 = bucoVar2.m();
                            if (m2 != null && (cmreVar = (cmre) m2.toBuilder()) != null) {
                                adaj adajVar2 = adajVar;
                                cmreVar.c(i);
                                cmreVar.copyOnWrite();
                                cmrf cmrfVar2 = (cmrf) cmreVar.instance;
                                cmrfVar2.a();
                                cmrfVar2.b.add(i, a2);
                                long epochMilli = adajVar2.d.f().toEpochMilli();
                                cmreVar.copyOnWrite();
                                ((cmrf) cmreVar.instance).c = epochMilli;
                                cmrfVar = (cmrf) cmreVar.build();
                            }
                            MessageIdType messageIdType = l;
                            String[] strArr = bueg.a;
                            bued buedVar = new bued();
                            buedVar.ap("updateReactedMessage");
                            buedVar.e(cmrfVar);
                            buedVar.c(messageIdType);
                            ((ensz) adaj.a.h()).q("Uri updated.");
                        }
                    }
                    i = i2;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: adae
            @Override // java.lang.Runnable
            public final void run() {
                ensz enszVar = (ensz) adaj.a.j();
                cmrl cmrlVar = a;
                String b = MessageIdType.this.b();
                String str2 = (cmrlVar.b == 101 ? (draj) cmrlVar.c : draj.a).c;
                draj drajVar3 = cmrlVar.b == 101 ? (draj) cmrlVar.c : draj.a;
                drajVar3.getClass();
                enszVar.J("Couldn't find the reacted message for reaction[MessageId = %s, Emotify ID = %s, Url = %s].", b, str2, adaj.a(drajVar3).toString());
            }
        });
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
