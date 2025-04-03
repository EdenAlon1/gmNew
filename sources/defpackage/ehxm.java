package defpackage;

import android.util.SparseArray;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.events.IEventObserver;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxm extends IEventObserver.Stub {
    static final cfva a = cfvl.q(146383903);
    private final SparseArray b;
    private final elbx c;

    public ehxm(SparseArray sparseArray, elbx elbxVar) {
        this.b = sparseArray;
        this.c = elbxVar;
    }

    final void a(Event event) {
        List<ehxn> list;
        ekzz f;
        SparseArray sparseArray = this.b;
        int i = event.g;
        synchronized (sparseArray) {
            ehxl ehxlVar = (ehxl) this.b.get(i);
            if (ehxlVar != null) {
                list = ehxlVar.b();
            } else {
                int i2 = engw.d;
                list = enou.a;
            }
        }
        for (ehxn ehxnVar : list) {
            if (((Boolean) a.e()).booleanValue()) {
                switch (event.g) {
                    case 0:
                        f = eleg.f("EventService.ProxyObserver#notifyInProcessEvent UNKNOWN");
                        break;
                    case 1:
                        f = eleg.f("EventService.ProxyObserver#notifyInProcessEvent AUTHENTICATION");
                        break;
                    case 2:
                        f = eleg.f("EventService.ProxyObserver#notifyInProcessEvent FILE_TRANSFER");
                        break;
                    case 3:
                        f = eleg.f("EventService.ProxyObserver#notifyInProcessEvent IMS");
                        break;
                    case 4:
                        f = eleg.f("EventService.ProxyObserver#notifyInProcessEvent GROUPS");
                        break;
                    case 5:
                        f = eleg.f("EventService.ProxyObserver#notifyInProcessEvent CHAT_SESSION");
                        break;
                    case 6:
                        f = eleg.f("EventService.ProxyObserver#notifyInProcessEvent LOCATIONSHARING");
                        break;
                    case 7:
                        f = eleg.f("EventService.ProxyObserver#notifyInProcessEvent PRESENCE");
                        break;
                    case 8:
                        f = eleg.f("EventService.ProxyObserver#notifyInProcessEvent SMS");
                        break;
                    default:
                        f = eleg.f("EventService.ProxyObserver#notifyInProcessEvent default");
                        break;
                }
                try {
                    ehxnVar.b(event);
                    f.close();
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                ehxnVar.b(event);
            }
        }
        if (list.isEmpty()) {
            csjy.o("RcsClientLib", "EventService has no listeners for event %d", Integer.valueOf(event.g));
        } else if (list.size() != 1) {
            csjy.m("RcsClientLib", "EventService has %d listeners for event %d", Integer.valueOf(list.size()), Integer.valueOf(event.g));
        } else {
            csjy.m("RcsClientLib", "EventService has 1 listeners for event %d: %s", Integer.valueOf(event.g), ((ehxn) list.get(0)).a());
        }
    }

    @Override // com.google.android.ims.rcsservice.events.IEventObserver
    public final void notifyEvent(Event event) {
        ekzm b;
        if (!((Boolean) a.e()).booleanValue()) {
            a(event);
            return;
        }
        elbx elbxVar = this.c;
        switch (event.g) {
            case 0:
                b = elbxVar.b("EventService.ProxyObserver#notifyEvent UNKNOWN");
                break;
            case 1:
                b = elbxVar.b("EventService.ProxyObserver#notifyEvent AUTHENTICATION");
                break;
            case 2:
                b = elbxVar.b("EventService.ProxyObserver#notifyEvent FILE_TRANSFER");
                break;
            case 3:
                b = elbxVar.b("EventService.ProxyObserver#notifyEvent IMS");
                break;
            case 4:
                b = elbxVar.b("EventService.ProxyObserver#notifyEvent GROUPS");
                break;
            case 5:
                b = elbxVar.b("EventService.ProxyObserver#notifyEvent CHAT_SESSION");
                break;
            case 6:
                b = elbxVar.b("EventService.ProxyObserver#notifyEvent LOCATIONSHARING");
                break;
            case 7:
                b = elbxVar.b("EventService.ProxyObserver#notifyEvent PRESENCE");
                break;
            case 8:
                b = elbxVar.b("EventService.ProxyObserver#notifyEvent SMS");
                break;
            default:
                b = elbxVar.b("EventService.ProxyObserver#notifyEvent default");
                break;
        }
        try {
            a(event);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
