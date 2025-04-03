package com.google.android.rcs.client.events;

import android.content.Context;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.ims.rcsservice.events.IEvent;
import defpackage.cfuu;
import defpackage.csjy;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.ehxc;
import defpackage.ehxd;
import defpackage.ehxg;
import defpackage.ehxi;
import defpackage.ehxk;
import defpackage.ehxl;
import defpackage.ehxm;
import defpackage.ehxn;
import defpackage.ehxo;
import defpackage.elbx;
import defpackage.eyrs;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class EventService extends ehxc<IEvent> {
    public static final diyy h = diyv.b("event_service_connection_deprecated");
    final ehxm i;
    private final SparseArray j;

    public EventService(elbx elbxVar, cfuu cfuuVar, ehxd ehxdVar, Context context, ehxi ehxiVar) {
        super(IEvent.class, context, ehxiVar, 1, Optional.of(ehxdVar));
        cfuuVar.a();
        SparseArray sparseArray = new SparseArray();
        this.j = sparseArray;
        this.i = new ehxm(sparseArray, elbxVar);
    }

    private final void h() {
        ehxo.a.a(this);
        synchronized (this.j) {
            int size = this.j.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.j.keyAt(i);
                int a = ((ehxl) this.j.valueAt(i)).a();
                try {
                    synchronized (this.d) {
                        try {
                            try {
                                if (a() != null) {
                                    ((IEvent) a()).unsubscribe(keyAt, a);
                                    csjy.d("RcsClientLib", "EventService removing key %d as listener for %d", Integer.valueOf(a), Integer.valueOf(keyAt));
                                }
                            } catch (ehxg unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e) {
                    csjy.p("RcsClientLib", e, "exception when unsubscribing for disconnect");
                }
            }
            this.j.clear();
        }
    }

    @Override // defpackage.ehxc
    protected final void d(String str) {
        super.d(str);
        ehxo.a.b.put(this, true);
    }

    @Override // defpackage.ehxc
    public void disconnect() {
        h();
        super.disconnect();
    }

    @Override // defpackage.ehxc
    protected final void e(String str) {
        h();
        ehxo.a.a(this);
        super.e(str);
    }

    @Override // defpackage.ehxc
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.ehxc
    public String getRcsServiceMetaDataKey() {
        return "EventServiceVersions";
    }

    @Override // defpackage.ehxc
    public eyrs getServiceNameLoggingEnum() {
        return eyrs.EVENT_SERVICE;
    }

    public boolean isSubscribed(ehxn ehxnVar) {
        synchronized (this.j) {
            int size = this.j.size();
            for (int i = 0; i < size; i++) {
                if (((ehxl) this.j.valueAt(i)).b().contains(ehxnVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Deprecated
    public void subscribe(int i, ehxn ehxnVar) {
        b();
        try {
            synchronized (this.j) {
                ehxl ehxlVar = (ehxl) this.j.get(i);
                if (ehxlVar == null) {
                    csjy.d("RcsClientLib", "EventService subscribing itself as listener for %d", Integer.valueOf(i));
                    ehxk ehxkVar = new ehxk(((IEvent) a()).subscribe(i, this.i), new CopyOnWriteArrayList());
                    this.j.put(i, ehxkVar);
                    ehxlVar = ehxkVar;
                }
                csjy.d("RcsClientLib", "EventService adding %s as listener for %d", ehxnVar.a(), Integer.valueOf(i));
                ehxlVar.b().add(ehxnVar);
            }
        } catch (Exception e) {
            throw new ehxg(e.getMessage(), e);
        }
    }

    public void unsubscribe(int i, ehxn ehxnVar) {
        b();
        try {
            synchronized (this.j) {
                ehxl ehxlVar = (ehxl) this.j.get(i);
                if (ehxlVar == null) {
                    csjy.n("RcsClientLib", "Cannot unsubscribe from Rcs Event Service, there are no observers");
                    return;
                }
                String a = ehxnVar.a();
                Integer valueOf = Integer.valueOf(i);
                csjy.d("RcsClientLib", "EventService removing %s as listener for %d", a, valueOf);
                ehxlVar.b().remove(ehxnVar);
                if (ehxlVar.b().isEmpty()) {
                    ((IEvent) a()).unsubscribe(i, ehxlVar.a());
                    this.j.remove(i);
                    csjy.d("RcsClientLib", "EventService removing itself as listener for %d", valueOf);
                }
            }
        } catch (Exception e) {
            throw new ehxg(e.getMessage(), e);
        }
    }

    public void unsubscribeAllCategories(ehxn ehxnVar) {
        b();
        try {
            synchronized (this.j) {
                int size = this.j.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    int keyAt = this.j.keyAt(i);
                    if (((ehxl) this.j.valueAt(i)).b().contains(ehxnVar)) {
                        arrayList.add(Integer.valueOf(keyAt));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    unsubscribe(((Integer) it.next()).intValue(), ehxnVar);
                }
            }
        } catch (Exception e) {
            throw new ehxg(e.getMessage(), e);
        }
    }
}
