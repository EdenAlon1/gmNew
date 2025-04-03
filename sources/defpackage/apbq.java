package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apbq implements AutoCloseable, cbvx {
    public final ffsk a;
    public final ffbr b;
    public ctbx d;
    private final cbwc e;
    private final azei f;
    public final Map c = new LinkedHashMap();
    private final Map g = new LinkedHashMap();

    public apbq(ffsk ffskVar, cbwc cbwcVar, azei azeiVar, ffbr ffbrVar) {
        this.a = ffskVar;
        this.e = cbwcVar;
        this.f = azeiVar;
        this.b = ffbrVar;
        azeiVar.e(this);
    }

    @Override // defpackage.cbvx
    public final void a(MessageIdType messageIdType, bdhg bdhgVar) {
        List list;
        messageIdType.getClass();
        bdhgVar.getClass();
        if (((Boolean) aoyx.e.e()).booleanValue()) {
            synchronized (this.g) {
                list = (List) this.g.get(bdhgVar);
            }
            if (list == null || list.isEmpty()) {
                synchronized (this.c) {
                    list = (List) this.c.get(messageIdType);
                }
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            alxo c = c(messageIdType, bdhgVar);
            if (c != null) {
                if (c != alxo.SENT && c != alxo.DELIVERED) {
                    c = null;
                }
                if (c != null) {
                    synchronized (list) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((aoyh) it.next()).e(c);
                        }
                    }
                }
            }
        }
    }

    public final alxo c(MessageIdType messageIdType, bdhg bdhgVar) {
        messageIdType.getClass();
        bdhgVar.getClass();
        Integer b = bdhgVar.k() ? this.e.b(bdhgVar) : apbs.a(messageIdType) ? this.e.a(messageIdType) : null;
        if (b != null) {
            return apvu.a(b.intValue());
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f.f(this);
        d();
        ctbx ctbxVar = this.d;
        if (ctbxVar != null) {
            ctbw.a(ctbxVar);
        }
        this.d = null;
    }

    public final void d() {
        synchronized (this.c) {
            this.c.clear();
        }
        synchronized (this.g) {
            this.g.clear();
        }
    }

    public final alyn e(MessageIdType messageIdType, bdhg bdhgVar, aqux aquxVar, alxo alxoVar, alyt alytVar, long j) {
        messageIdType.getClass();
        bdhgVar.getClass();
        alxoVar.getClass();
        Instant.ofEpochMilli(j).getClass();
        aoyh aoyhVar = new aoyh(aquxVar, alxoVar, alytVar, this.b);
        if (apbs.a(messageIdType)) {
            synchronized (this.c) {
                Map map = this.c;
                Object obj = map.get(messageIdType);
                if (obj == null) {
                    obj = DesugarCollections.synchronizedList(new ArrayList());
                    obj.getClass();
                    map.put(messageIdType, obj);
                }
                ((List) obj).add(aoyhVar);
            }
        }
        if (!bdhgVar.k()) {
            return aoyhVar;
        }
        synchronized (this.g) {
            Map map2 = this.g;
            Object obj2 = map2.get(bdhgVar);
            if (obj2 == null) {
                obj2 = DesugarCollections.synchronizedList(new ArrayList());
                obj2.getClass();
                map2.put(bdhgVar, obj2);
            }
            ((List) obj2).add(aoyhVar);
        }
        return aoyhVar;
    }

    @Override // defpackage.cbvx
    public final /* synthetic */ void b(MessageCoreData messageCoreData) {
    }
}
