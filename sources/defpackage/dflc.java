package defpackage;

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dflc extends dfkw {
    public dfmh q;
    private final eyhs r;

    public dflc(dfld dfldVar, eyhs eyhsVar) {
        super(dfldVar);
        this.r = eyhsVar;
    }

    @Override // defpackage.dfkw
    public final /* bridge */ /* synthetic */ dfkw a() {
        Iterator it = ((dfld) this.a).n.iterator();
        while (it.hasNext()) {
            ((dflb) it.next()).a(this);
        }
        Iterator it2 = dfld.m.iterator();
        while (it2.hasNext()) {
            ((dflb) it2.next()).a(this);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dfkw
    public final LogEventParcelable b() {
        epme epmeVar = this.d;
        if (epmeVar != null) {
            faxp faxpVar = this.b;
            eyee byteString = epmeVar.toByteString();
            faxpVar.copyOnWrite();
            faxq faxqVar = (faxq) faxpVar.instance;
            faxq faxqVar2 = faxq.a;
            faxqVar.b |= 524288;
            faxqVar.h = byteString;
        }
        faxp faxpVar2 = this.b;
        eyee byteString2 = this.r.toByteString();
        faxpVar2.copyOnWrite();
        faxq faxqVar3 = (faxq) faxpVar2.instance;
        faxq faxqVar4 = faxq.a;
        byteString2.getClass();
        faxqVar3.b |= 2048;
        faxqVar3.f = byteString2;
        faxq faxqVar5 = (faxq) this.b.build();
        dfld dfldVar = (dfld) this.a;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(dfldVar.j, dfkt.a(dfldVar.g), this.k, this.j, d(), ((dfld) this.a).k);
        byte[] byteArray = faxqVar5.toByteArray();
        int[] f = dfkt.f(this.e);
        ArrayList arrayList = this.f;
        String[] strArr = arrayList != null ? (String[]) arrayList.toArray(dfkt.b) : null;
        int[] f2 = dfkt.f(this.g);
        ArrayList arrayList2 = this.h;
        ExperimentTokens[] experimentTokensArr = arrayList2 != null ? (ExperimentTokens[]) arrayList2.toArray(dfkt.a) : null;
        Set set = this.i;
        return new LogEventParcelable(playLoggerContext, faxqVar5, byteArray, f, strArr, f2, experimentTokensArr, set != null ? (String[]) set.toArray(dfkt.b) : null, faxqVar5.e);
    }

    @Override // defpackage.dfkw
    public final dhre c() {
        if (this.c) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.c = true;
        return ((dfld) this.a).h.a(this);
    }
}
