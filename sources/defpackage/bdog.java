package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdog extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bdol b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ MessageIdType d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdog(ffgu ffguVar, bdol bdolVar, MessageCoreData messageCoreData, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.b = bdolVar;
        this.c = messageCoreData;
        this.d = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdog) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            closeable = (Closeable) this.e;
            try {
                ffci.b(obj);
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(closeable, th);
                    throw th2;
                }
            }
        } else {
            ffci.b(obj);
            ffsk ffskVar = (ffsk) this.e;
            ekzz f = eleg.f("OutgoingMessageInsertionListenersManager::onAfterInsertion");
            try {
                Collection<bdod> b = this.b.b();
                ArrayList arrayList = new ArrayList(ffdx.n(b, 10));
                for (bdod bdodVar : b) {
                    ffhd ffhdVar = this.b.b;
                    arrayList.add(ffra.b(ffskVar, ekxi.a(ffhdVar), ffsm.a, new bdoh(null, bdodVar, this.c, this.d)));
                }
                this.e = f;
                this.a = 1;
                obj = ffqv.a(arrayList, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                closeable = f;
            } catch (Throwable th3) {
                th = th3;
                closeable = f;
                throw th;
            }
        }
        List list = (List) obj;
        ffig.a(closeable, null);
        return list;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bdog bdogVar = new bdog(ffguVar, this.b, this.c, this.d);
        bdogVar.e = obj;
        return bdogVar;
    }
}
