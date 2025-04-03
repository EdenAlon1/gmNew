package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfkw {
    public final dfkt a;
    public final faxp b;
    public boolean c;
    public epme d;
    public ArrayList e;
    public ArrayList f;
    protected ArrayList g;
    public ArrayList h;
    public Set i;
    public String j;
    public String k;
    public faxs l;
    public final dfli m;
    public final ListenableFuture n;
    public dfli o;
    public boolean p;

    /* JADX WARN: Multi-variable type inference failed */
    protected dfkw(dfkt dfktVar) {
        long seconds;
        faxp faxpVar = (faxp) faxq.a.createBuilder();
        this.b = faxpVar;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.p = false;
        this.a = dfktVar;
        this.k = dfktVar.i;
        this.j = dfktVar.e;
        dflf dflfVar = dfktVar.g.getApplicationContext() instanceof dflf ? (dflf) dfktVar.g.getApplicationContext() : (dflf) dflh.a.get();
        dfli a = dflfVar != null ? dflfVar.a() : null;
        if (a == null) {
            this.m = null;
        } else if (a.b() == faxv.CPS_APP_PROCESS_GLOBAL_PROVIDER || a.b() == faxv.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER) {
            this.m = a;
        } else {
            Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + a.b().toString() + " is not one of the process-level expected values: " + String.valueOf(faxv.CPS_APP_PROCESS_GLOBAL_PROVIDER) + " or " + String.valueOf(faxv.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER));
            this.m = null;
        }
        this.n = dflfVar != null ? dflfVar.b() : null;
        long currentTimeMillis = System.currentTimeMillis();
        faxpVar.copyOnWrite();
        faxq faxqVar = (faxq) faxpVar.instance;
        faxqVar.b |= 1;
        faxqVar.c = currentTimeMillis;
        long j = ((faxq) faxpVar.instance).c;
        seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(j));
        faxpVar.copyOnWrite();
        faxq faxqVar2 = (faxq) faxpVar.instance;
        faxqVar2.b |= 131072;
        faxqVar2.g = seconds;
        if (dubc.d(dfktVar.g)) {
            faxpVar.copyOnWrite();
            faxq faxqVar3 = (faxq) faxpVar.instance;
            faxqVar3.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            faxqVar3.i = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime != 0) {
            faxpVar.copyOnWrite();
            faxq faxqVar4 = (faxq) faxpVar.instance;
            faxqVar4.b |= 2;
            faxqVar4.d = elapsedRealtime;
        }
    }

    public abstract dfkw a();

    public abstract LogEventParcelable b();

    public abstract dhre c();

    public final faxs d() {
        faxs faxsVar = this.l;
        return faxsVar != null ? faxsVar : this.a.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(dfli dfliVar) {
        faxw faxwVar = ((faxq) this.b.instance).l;
        if (faxwVar == null) {
            faxwVar = faxw.a;
        }
        faxt faxtVar = (faxt) faxwVar.toBuilder();
        faxv b = dfliVar.b();
        faxtVar.copyOnWrite();
        faxw faxwVar2 = (faxw) faxtVar.instance;
        faxwVar2.d = b.l;
        faxwVar2.b |= 2;
        ezwp ezwpVar = faxwVar2.c;
        if (ezwpVar == null) {
            ezwpVar = ezwp.a;
        }
        ezwo ezwoVar = (ezwo) ezwpVar.toBuilder();
        ezwn ezwnVar = ((ezwp) ezwoVar.instance).c;
        if (ezwnVar == null) {
            ezwnVar = ezwn.a;
        }
        ezwm ezwmVar = (ezwm) ezwnVar.toBuilder();
        int a = dfliVar.a();
        ezwmVar.copyOnWrite();
        ezwn ezwnVar2 = (ezwn) ezwmVar.instance;
        ezwnVar2.b |= 1;
        ezwnVar2.c = a;
        ezwoVar.copyOnWrite();
        ezwp ezwpVar2 = (ezwp) ezwoVar.instance;
        ezwn ezwnVar3 = (ezwn) ezwmVar.build();
        ezwnVar3.getClass();
        ezwpVar2.c = ezwnVar3;
        ezwpVar2.b |= 1;
        faxp faxpVar = this.b;
        faxtVar.copyOnWrite();
        faxw faxwVar3 = (faxw) faxtVar.instance;
        ezwp ezwpVar3 = (ezwp) ezwoVar.build();
        ezwpVar3.getClass();
        faxwVar3.c = ezwpVar3;
        faxwVar3.b |= 1;
        faxw faxwVar4 = (faxw) faxtVar.build();
        faxpVar.copyOnWrite();
        faxq faxqVar = (faxq) faxpVar.instance;
        faxwVar4.getClass();
        faxqVar.l = faxwVar4;
        faxqVar.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
    }

    public final void f(int[] iArr) {
        if (this.a.e()) {
            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr == null || (iArr.length) == 0) {
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        for (int i : iArr) {
            this.g.add(Integer.valueOf(i));
        }
    }

    public final void g(String str) {
        if (this.a.e()) {
            throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(str);
    }

    public final void h(String str) {
        if (!this.a.k.a(dfmj.ACCOUNT_NAME)) {
            throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
        }
        this.j = str;
    }

    public final void i(int i) {
        faxp faxpVar = this.b;
        faxpVar.copyOnWrite();
        faxq faxqVar = (faxq) faxpVar.instance;
        faxq faxqVar2 = faxq.a;
        faxqVar.b |= 32;
        faxqVar.e = i;
    }

    public final void j(long j, long j2) {
        long seconds;
        faxp faxpVar = this.b;
        faxpVar.copyOnWrite();
        faxq faxqVar = (faxq) faxpVar.instance;
        faxq faxqVar2 = faxq.a;
        faxqVar.b |= 1;
        faxqVar.c = j;
        faxp faxpVar2 = this.b;
        faxpVar2.copyOnWrite();
        faxq faxqVar3 = (faxq) faxpVar2.instance;
        faxqVar3.b |= 2;
        faxqVar3.d = j2;
        faxp faxpVar3 = this.b;
        long j3 = ((faxq) faxpVar3.instance).c;
        seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(j3));
        faxpVar3.copyOnWrite();
        faxq faxqVar4 = (faxq) faxpVar3.instance;
        faxqVar4.b |= 131072;
        faxqVar4.g = seconds;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.j);
        sb.append(", logSourceName: ");
        sb.append(this.k);
        sb.append(", qosTier: ");
        sb.append(d().f);
        sb.append(", veMessage: ");
        sb.append(this.d);
        sb.append(", testCodes: ");
        ArrayList arrayList = this.e;
        sb.append(arrayList != null ? dfkt.c(arrayList) : null);
        sb.append(", mendelPackages: ");
        ArrayList arrayList2 = this.f;
        sb.append(arrayList2 != null ? dfkt.c(arrayList2) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList3 = this.g;
        sb.append(arrayList3 != null ? dfkt.c(arrayList3) : null);
        sb.append(", experimentTokens: ");
        ArrayList arrayList4 = this.h;
        sb.append(arrayList4 != null ? dfkt.c(arrayList4) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
