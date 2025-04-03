package com.google.android.apps.messaging.shared.datamodel.action.common;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.areh;
import defpackage.arej;
import defpackage.bbbw;
import defpackage.bbbx;
import defpackage.bbby;
import defpackage.bbcb;
import defpackage.bbcc;
import defpackage.bbcd;
import defpackage.bbcf;
import defpackage.bbcg;
import defpackage.bbcj;
import defpackage.bbcq;
import defpackage.cniz;
import defpackage.cqoh;
import defpackage.csix;
import defpackage.ctba;
import defpackage.dktk;
import defpackage.ekzz;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.eogt;
import defpackage.erpp;
import defpackage.ffbr;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class Action<ResultT> implements Parcelable {
    private final ffbr c;
    private final ffbr d;
    public final String s;
    public final bbcg t;
    public List u = new ArrayList();
    public bbcj v;
    public final eogt w;
    public final ArrayList x;
    public static final long r = TimeUnit.SECONDS.toMillis(6);
    private static final Object a = new Object();
    private static long b = -1;

    /* compiled from: PG */
    public interface a {
        ffbr gf();

        ffbr gg();

        ffbr gy();

        cqoh v();
    }

    public Action(Bundle bundle, eogt eogtVar) {
        ArrayList arrayList;
        a aVar = (a) ctba.a(a.class);
        this.c = aVar.gf();
        ffbr gg = aVar.gg();
        this.d = gg;
        this.s = h(getClass().getSimpleName(), aVar.v());
        this.w = eogtVar;
        ActionParameters actionParameters = new ActionParameters(bundle);
        this.t = actionParameters;
        if (((areh) gg.b()).a()) {
            arrayList = actionParameters.n("action_callstack_key", ParcelableStackTraceElement.class);
            if (arrayList == null) {
                arrayList = k();
            }
        } else {
            arrayList = null;
        }
        this.x = arrayList;
    }

    private static String h(String str, cqoh cqohVar) {
        long j;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(":");
        synchronized (a) {
            long j2 = b;
            if (j2 == -1) {
                j2 = cqohVar.a() * 1000;
            }
            j = j2 + 1;
            b = j;
        }
        sb.append(j);
        return sb.toString();
    }

    private static ArrayList k() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        ArrayList arrayList = new ArrayList(stackTrace.length);
        for (int i = 0; i < stackTrace.length && i < 10; i++) {
            arrayList.add(new ParcelableStackTraceElement(stackTrace[i]));
        }
        return arrayList;
    }

    public static bbbw o(List list, Throwable th) {
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[list.size()];
        for (int i = 0; i < list.size() && i < 10; i++) {
            ParcelableStackTraceElement parcelableStackTraceElement = (ParcelableStackTraceElement) list.get(i);
            stackTraceElementArr[i] = new StackTraceElement(parcelableStackTraceElement.a, parcelableStackTraceElement.b, parcelableStackTraceElement.c, parcelableStackTraceElement.d);
        }
        bbbw bbbwVar = new bbbw(th);
        bbbwVar.setStackTrace(stackTraceElementArr);
        return bbbwVar;
    }

    @Deprecated
    public final void A() {
        B(new bbcc(new bbbx(), this));
    }

    @Deprecated
    public void B(bbcd bbcdVar) {
        F(bbcdVar);
    }

    public final void C(Action action) {
        bbcd.b(this.s, new bbcc(new bbbx(), this));
        ((bbcf) this.c.b()).h(this, action);
    }

    public final void D(Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeParcelable(this.t.i(), i);
    }

    public final boolean E() {
        return !this.u.isEmpty();
    }

    public void F(bbcd bbcdVar) {
        bbcd.b(this.s, bbcdVar);
        ((bbcf) this.c.b()).e(this);
    }

    public void G(long j) {
        ((bbcf) this.c.b()).i(this, j);
    }

    public abstract ekzz a();

    public Object b() {
        return null;
    }

    public abstract String c();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public elfl e() {
        return elfo.g(new Callable() { // from class: bbbt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Action.this.b();
            }
        }, erpp.a);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Action)) {
            return this.s.equals(((Action) obj).s);
        }
        return false;
    }

    public Bundle fR() {
        return null;
    }

    public elfl fS() {
        return elfo.g(new Callable() { // from class: bbbv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Action.this.fR();
            }
        }, erpp.a);
    }

    public elfl fT() {
        return elfo.g(new Callable() { // from class: bbbs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, erpp.a);
    }

    public Object fU(Bundle bundle) {
        return null;
    }

    public boolean fV() {
        return true;
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final bbcd p(bbcb bbcbVar) {
        bbcc bbccVar = new bbcc(bbcbVar, this);
        F(bbccVar);
        return bbccVar;
    }

    public final elfl q() {
        return ((bbcf) this.c.b()).b(this);
    }

    public ListenableFuture r(cniz cnizVar) {
        ffbr ffbrVar = this.c;
        return ((bbcf) ffbrVar.b()).c(this, cnizVar, bbcj.a(this));
    }

    public final ListenableFuture s() {
        return ((bbcf) this.c.b()).d(this);
    }

    public ListenableFuture t() {
        return ((bbcf) this.c.b()).e(this);
    }

    public final String toString() {
        return String.valueOf(getClass()) + "-" + this.s;
    }

    public final Throwable u(Throwable th) {
        ArrayList arrayList = this.x;
        return arrayList == null ? th : o(arrayList, th);
    }

    public final void v(int i) {
        ((bbcf) this.c.b()).f(this, i);
    }

    public final void w() {
        this.u.add(this);
    }

    public void x(long j) {
        ffbr ffbrVar = this.c;
        ((bbcf) ffbrVar.b()).g(this, bbcj.a(this), j);
    }

    public final void y(int i, long j) {
        ((bbcf) this.c.b()).g(this, i, j);
    }

    public final void z(bbcj bbcjVar) {
        if (!bbcjVar.d.contains(this)) {
            throw new IllegalStateException("Call Job.addForegroundAction or Job.addBackgroundAction instead");
        }
        this.v = bbcjVar;
    }

    /* compiled from: PG */
    public static final class ParcelableStackTraceElement implements Parcelable {
        public static final Parcelable.Creator<ParcelableStackTraceElement> CREATOR = new bbby();
        public final String a;
        public final String b;
        public final String c;
        public final int d;

        public ParcelableStackTraceElement(Parcel parcel) {
            String readString = parcel.readString();
            this.a = readString == null ? "Unparcelling Error" : readString;
            String readString2 = parcel.readString();
            this.b = readString2 != null ? readString2 : "Unparcelling Error";
            this.c = parcel.readString();
            this.d = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
        }

        public ParcelableStackTraceElement(StackTraceElement stackTraceElement) {
            this.a = stackTraceElement.getClassName();
            this.b = stackTraceElement.getMethodName();
            this.c = stackTraceElement.getFileName();
            this.d = stackTraceElement.getLineNumber();
        }
    }

    public Action(Parcel parcel, eogt eogtVar) {
        ArrayList arrayList;
        a aVar = (a) ctba.a(a.class);
        this.c = aVar.gf();
        ffbr gg = aVar.gg();
        this.d = gg;
        String readString = parcel.readString();
        readString.getClass();
        this.s = readString;
        csix.f(dktk.d(readString));
        this.w = eogtVar;
        try {
            bbcg bbcgVar = (ActionParameters) parcel.readParcelable(ActionParameters.class.getClassLoader());
            if (((arej) aVar.gy().b()).a()) {
                if (bbcgVar == null) {
                    bbcgVar = new bbcq();
                }
            } else if (bbcgVar == null) {
                bbcgVar = new ActionParameters();
            }
            this.t = bbcgVar;
            if (((areh) gg.b()).a()) {
                arrayList = bbcgVar.n("action_callstack_key", ParcelableStackTraceElement.class);
                if (arrayList == null) {
                    arrayList = k();
                }
            } else {
                arrayList = null;
            }
            this.x = arrayList;
        } catch (BadParcelableException e) {
            csix.p("Failed to unparcel action parameters", e);
            throw e;
        }
    }

    public Action(bbcg bbcgVar, String str, eogt eogtVar) {
        ArrayList arrayList;
        a aVar = (a) ctba.a(a.class);
        this.c = aVar.gf();
        ffbr gg = aVar.gg();
        this.d = gg;
        this.s = str;
        this.w = eogtVar;
        this.t = bbcgVar;
        if (((areh) gg.b()).a()) {
            arrayList = bbcgVar.n("action_callstack_key", ParcelableStackTraceElement.class);
            if (arrayList == null) {
                arrayList = k();
            }
        } else {
            arrayList = null;
        }
        this.x = arrayList;
    }

    protected Action(eogt eogtVar) {
        a aVar = (a) ctba.a(a.class);
        this.c = aVar.gf();
        ffbr gg = aVar.gg();
        this.d = gg;
        this.s = h(getClass().getSimpleName(), aVar.v());
        this.w = eogtVar;
        if (((arej) aVar.gy().b()).a()) {
            this.t = new bbcq();
        } else {
            this.t = new ActionParameters();
        }
        if (!((areh) gg.b()).a()) {
            this.x = null;
            return;
        }
        ArrayList k = k();
        this.x = k;
        this.t.u("action_callstack_key", k);
    }

    protected Action(String str, eogt eogtVar) {
        csix.f(dktk.d(str));
        a aVar = (a) ctba.a(a.class);
        this.c = aVar.gf();
        ffbr gg = aVar.gg();
        this.d = gg;
        this.s = str;
        this.w = eogtVar;
        if (((arej) aVar.gy().b()).a()) {
            this.t = new bbcq();
        } else {
            this.t = new ActionParameters();
        }
        if (!((areh) gg.b()).a()) {
            this.x = null;
            return;
        }
        ArrayList k = k();
        this.x = k;
        this.t.u("action_callstack_key", k);
    }
}
