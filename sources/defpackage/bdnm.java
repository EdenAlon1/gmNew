package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdnm implements cbvx, bdnu, cskg {
    public static final cfva a = cfvl.f(cfvl.b, "max_original_message_id_cache_size", 200);
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // defpackage.cbvx
    public final void b(MessageCoreData messageCoreData) {
        c(messageCoreData.E(), messageCoreData.D());
    }

    public final void c(bdhg bdhgVar, bdhg bdhgVar2) {
        if (bdhgVar.i()) {
            return;
        }
        if (this.b.size() > ((Long) a.e()).longValue()) {
            this.b.clear();
        }
        this.b.put(bdhgVar, bdhgVar2);
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final void k(MessageCoreData messageCoreData) {
        c(messageCoreData.E(), messageCoreData.D());
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        this.b.clear();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.cbvx
    public final void a(MessageIdType messageIdType, bdhg bdhgVar) {
    }
}
