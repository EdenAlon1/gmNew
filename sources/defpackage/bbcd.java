package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class bbcd {
    public final Object b = new Object();
    protected int c = 1;
    public bbcb d;
    public final Object e;
    private final String h;
    private static final cskc f = cskc.g("BugleDataModel", "ActionMonitor");
    private static final Handler g = new Handler(Looper.getMainLooper());
    public static final cpn a = new cpn();

    protected bbcd(String str, Object obj) {
        this.h = str;
        this.e = obj;
    }

    public static void a(Action action, Object obj) {
        int i;
        boolean E = action.E();
        bbcd f2 = f(action.s);
        if (f2 != null) {
            i = f2.c;
            synchronized (f2.b) {
                if (E) {
                    e(action, 3, 4);
                }
            }
        } else {
            i = 3;
        }
        cskc cskcVar = f;
        if (cskcVar.t(2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            csjb d = cskcVar.d();
            d.I("Operation-");
            d.v(action.s);
            d.v(": @");
            d.v(simpleDateFormat.format(new Date()));
            d.v("UTC.");
            d.A("oldMonitorState", g(i));
            d.A("newMonitorState", "EXECUTED");
            d.r();
        }
        if (action.E()) {
            return;
        }
        c(action, 3, obj, true);
    }

    public static void b(String str, bbcd bbcdVar) {
        if (!TextUtils.isEmpty(bbcdVar.h) && !TextUtils.isEmpty(str) && str.equals(bbcdVar.h)) {
            cpn cpnVar = a;
            synchronized (cpnVar) {
                cpnVar.put(str, bbcdVar);
            }
        } else {
            throw new IllegalArgumentException("Monitor key " + bbcdVar.h + " not compatible with action key " + str);
        }
    }

    public static void c(final Action action, int i, final Object obj, final boolean z) {
        bbcb bbcbVar;
        int i2;
        final bbcd f2 = f(action.s);
        if (f2 != null) {
            int i3 = f2.c;
            synchronized (f2.b) {
                e(action, i, 8);
                bbcbVar = f2.d;
            }
            if (bbcbVar != null) {
                g.post(eldl.l(new Runnable() { // from class: bbca
                    @Override // java.lang.Runnable
                    public final void run() {
                        bbcb bbcbVar2;
                        bbcd bbcdVar = bbcd.this;
                        synchronized (bbcdVar.b) {
                            bbcbVar2 = bbcdVar.d;
                            if (bbcbVar2 == null) {
                                bbcbVar2 = null;
                            }
                            bbcdVar.d = null;
                        }
                        if (bbcbVar2 != null) {
                            Object obj2 = obj;
                            Action action2 = action;
                            if (z) {
                                bbcbVar2.a(bbcdVar, action2, bbcdVar.e, obj2);
                            } else {
                                bbcbVar2.b(bbcdVar, bbcdVar.e, obj2);
                            }
                        }
                    }
                }));
            }
            String str = action.s;
            synchronized (f2.b) {
                i2 = f2.c;
            }
            if (i2 == 8) {
                cpn cpnVar = a;
                synchronized (cpnVar) {
                    cpnVar.remove(str);
                }
            }
            i = i3;
        }
        cskc cskcVar = f;
        if (cskcVar.t(2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            csjb d = cskcVar.d();
            d.I("Operation-");
            d.v(action.s);
            d.v(": @");
            d.v(simpleDateFormat.format(new Date()));
            d.v("UTC.");
            d.A("oldMonitorState", g(i));
            d.A("newMonitorState", g(8));
            d.r();
        }
    }

    public static void e(Action action, int i, int i2) {
        bbcd f2 = f(action.s);
        if (f2 != null) {
            int i3 = f2.c;
            synchronized (f2.b) {
                if (i != 0) {
                    int i4 = f2.c;
                    if (i4 != i) {
                        throw new IllegalStateException("On updateState to " + i2 + " was " + g(i4) + ". expecting " + g(i));
                    }
                }
                if (i2 != f2.c) {
                    f2.c = i2;
                }
            }
            i2 = f2.c;
            i = i3;
        }
        cskc cskcVar = f;
        if (cskcVar.t(2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            csjb d = cskcVar.d();
            d.I("Operation-");
            d.v(action.s);
            d.v(": @");
            d.v(simpleDateFormat.format(new Date()));
            d.v("UTC.");
            d.A("oldMonitorState", g(i));
            d.A("newMonitorState", g(i2));
            d.r();
        }
    }

    private static bbcd f(String str) {
        bbcd bbcdVar;
        cpn cpnVar = a;
        synchronized (cpnVar) {
            bbcdVar = (bbcd) cpnVar.get(str);
        }
        return bbcdVar;
    }

    private static String g(int i) {
        switch (i) {
            case 0:
                return "STATE_UNDEFINED";
            case 1:
                return "STATE_CREATED";
            case 2:
                return "STATE_QUEUED";
            case 3:
                return "STATE_EXECUTING";
            case 4:
                return "STATE_BACKGROUND_ACTIONS_QUEUED";
            case 5:
                return "STATE_EXECUTING_BACKGROUND_ACTION";
            case 6:
                return "STATE_BACKGROUND_COMPLETION_QUEUED";
            case 7:
                return "STATE_PROCESSING_BACKGROUND_RESPONSE";
            default:
                return "STATE_COMPLETE";
        }
    }

    final void d(bbcb bbcbVar) {
        synchronized (this.b) {
            this.d = bbcbVar;
        }
    }
}
