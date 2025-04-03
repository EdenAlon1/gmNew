package defpackage;

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfmm extends dfkw {
    public dfmm(dfmn dfmnVar, eyee eyeeVar) {
        super(dfmnVar);
        faxp faxpVar = this.b;
        faxpVar.copyOnWrite();
        faxq faxqVar = (faxq) faxpVar.instance;
        faxq faxqVar2 = faxq.a;
        faxqVar.b |= 2048;
        faxqVar.f = eyeeVar;
    }

    @Override // defpackage.dfkw
    public final /* bridge */ /* synthetic */ dfkw a() {
        Iterator it = ((dfmn) this.a).m.iterator();
        dfmm dfmmVar = this;
        while (it.hasNext()) {
            dfmmVar = ((dfml) it.next()).a();
            if (dfmmVar == null) {
                return null;
            }
        }
        return dfmmVar;
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
        faxq faxqVar3 = (faxq) this.b.build();
        dfmn dfmnVar = (dfmn) this.a;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(dfmnVar.j, dfkt.a(dfmnVar.g), this.k, this.j, d(), ((dfmn) this.a).k);
        byte[] byteArray = faxqVar3.toByteArray();
        int[] f = dfkt.f(this.e);
        ArrayList arrayList = this.f;
        String[] strArr = arrayList != null ? (String[]) arrayList.toArray(dfkt.b) : null;
        int[] f2 = dfkt.f(this.g);
        ArrayList arrayList2 = this.h;
        ExperimentTokens[] experimentTokensArr = arrayList2 != null ? (ExperimentTokens[]) arrayList2.toArray(dfkt.a) : null;
        Set set = this.i;
        return new LogEventParcelable(playLoggerContext, faxqVar3, byteArray, f, strArr, f2, experimentTokensArr, set != null ? (String[]) set.toArray(dfkt.b) : null, faxqVar3.e);
    }

    @Override // defpackage.dfkw
    public final dhre c() {
        throw null;
    }
}
