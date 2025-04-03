package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class diyb {
    public String a;
    public diyn b;
    protected HandlerThread c;

    protected diyb() {
    }

    public final Message a(int i) {
        return Message.obtain(this.b, i);
    }

    public final Message b(int i, Object obj) {
        return Message.obtain(this.b, i, obj);
    }

    public final Message c(int i, int i2, int i3, Object obj) {
        return Message.obtain(this.b, i, i2, i3, obj);
    }

    public final dixy d() {
        diyn diynVar = this.b;
        if (diynVar == null) {
            return null;
        }
        return diynVar.b();
    }

    public final void e(dixy dixyVar) {
        this.b.c(dixyVar, null);
    }

    public final void f(dixy dixyVar, dixy dixyVar2) {
        this.b.c(dixyVar, dixyVar2);
    }

    public final void g(Message message) {
        diyn diynVar = this.b;
        Message obtainMessage = diynVar.obtainMessage();
        obtainMessage.copyFrom(message);
        diynVar.l.add(obtainMessage);
    }

    protected void h(String str) {
        Log.e(this.a, str);
    }

    protected void i(String str) {
        Log.i(this.a, str);
    }

    public final void m() {
        i("quit");
        diyn diynVar = this.b;
        if (diynVar == null) {
            return;
        }
        diynVar.sendMessage(diynVar.obtainMessage(-1, diyn.a));
    }

    public final void n() {
        i("quitNow");
        diyn diynVar = this.b;
        if (diynVar == null) {
            return;
        }
        diynVar.sendMessageAtFrontOfQueue(diynVar.obtainMessage(-1, diyn.a));
    }

    public final void o(dixx dixxVar) {
        this.b.i.add(dixxVar);
    }

    public final void p(int i) {
        diyn diynVar = this.b;
        if (diynVar == null) {
            return;
        }
        diynVar.removeMessages(i);
    }

    public final void q(int i) {
        diyn diynVar = this.b;
        if (diynVar == null) {
            return;
        }
        diynVar.sendMessage(a(i));
    }

    public final void r(int i, int i2) {
        diyn diynVar = this.b;
        if (diynVar == null) {
            return;
        }
        diynVar.sendMessage(Message.obtain(diynVar, i, i2, 0));
    }

    public final void s(int i, Object obj) {
        diyn diynVar = this.b;
        if (diynVar == null) {
            return;
        }
        diynVar.sendMessage(b(i, obj));
    }

    public final void t(int i, long j) {
        diyn diynVar = this.b;
        if (diynVar == null) {
            return;
        }
        diynVar.sendMessageDelayed(a(i), j);
    }

    public final String toString() {
        String str;
        String str2 = "(null)";
        try {
            str = this.a.toString();
            try {
                str2 = this.b.b().a().toString();
            } catch (NullPointerException unused) {
            }
        } catch (NullPointerException unused2) {
            str = "(null)";
        }
        return a.m(str2, str, "name=", " state=");
    }

    public final void u(dixy dixyVar) {
        this.b.k = dixyVar;
    }

    public void v() {
        dixy dixyVar;
        i(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
        diyn diynVar = this.b;
        if (diynVar == null) {
            return;
        }
        int i = 0;
        for (diym diymVar : diynVar.j.values()) {
            int i2 = 0;
            for (; diymVar != null; diymVar = diymVar.b) {
                i2++;
            }
            if (i < i2) {
                i = i2;
            }
        }
        diynVar.b = new diym[i];
        diynVar.d = new diym[i];
        if (diynVar.k == null) {
            diym diymVar2 = null;
            diym diymVar3 = null;
            for (diym diymVar4 : diynVar.j.values()) {
                if (diymVar4.b == null && (dixyVar = diymVar4.a) != diynVar.f && dixyVar != diynVar.g) {
                    if (diymVar3 == null) {
                        diymVar3 = diymVar4;
                    } else {
                        Log.e(diynVar.h.a, "state machines with multiple root states must be initialized via setInitialstate");
                    }
                }
            }
            if (diymVar3 == null) {
                Log.e(diynVar.h.a, "state machines must contain a root state");
            } else {
                diymVar2 = diymVar3;
            }
            diynVar.k = diymVar2.a;
        }
        diym diymVar5 = (diym) diynVar.j.get(diynVar.k);
        diynVar.e = 0;
        while (diymVar5 != null) {
            diym[] diymVarArr = diynVar.d;
            int i3 = diynVar.e;
            diymVarArr[i3] = diymVar5;
            diymVar5 = diymVar5.b;
            diynVar.e = i3 + 1;
        }
        diynVar.c = -1;
        diynVar.a();
        diynVar.f();
    }

    public final void w(dixy dixyVar) {
        this.b.e(dixyVar);
        l();
    }

    protected diyb(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.c = handlerThread;
        dtnu.a(handlerThread);
        this.c.start();
        Looper looper = this.c.getLooper();
        this.a = str;
        this.b = new diyn(looper, this);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l() {
    }
}
