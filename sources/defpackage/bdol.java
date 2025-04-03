package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdol {
    public static final emyl a = cfvl.x(184269564, "enable_outgoing_message_insertion_listeners");
    public final ffhd b;
    public final ffhd c;
    public final ffsk d;
    private final ffbz e;
    private final ffbz f;

    public bdol(ffhd ffhdVar, ffhd ffhdVar2, ffsk ffskVar, final fazb fazbVar) {
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffskVar.getClass();
        fazbVar.getClass();
        this.b = ffhdVar;
        this.c = ffhdVar2;
        this.d = ffskVar;
        this.e = ffca.a(new ffix() { // from class: bdoe
            @Override // defpackage.ffix
            public final Object invoke() {
                return (Boolean) ((cfup) bdol.a.get()).e();
            }
        });
        this.f = ffca.a(new ffix() { // from class: bdof
            @Override // defpackage.ffix
            public final Object invoke() {
                if (!bdol.this.a().booleanValue()) {
                    return ffen.a;
                }
                Object b = fazbVar.b();
                b.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj : (Iterable) b) {
                    if (((bdod) obj).j()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
    }

    public final Boolean a() {
        return (Boolean) this.e.a();
    }

    public final Collection b() {
        return (Collection) this.f.a();
    }

    public final void c(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        ekzz f = eleg.f("OutgoingMessageInsertionListenersManager::onSplitIntoMessage");
        try {
            Iterator it = b().iterator();
            while (it.hasNext()) {
                ((bdod) it.next()).i(messageCoreData);
            }
            ffig.a(f, null);
        } finally {
        }
    }
}
