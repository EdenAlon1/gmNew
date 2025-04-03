package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceec implements fbba {
    /* JADX WARN: Multi-variable type inference failed */
    public static ceve a(Object obj, cdwi cdwiVar) {
        eyhz parserForType = cdwa.a.getParserForType();
        parserForType.getClass();
        poa poaVar = poa.LINEAR;
        long longValue = ((Number) cdwo.b.e()).longValue();
        cfyt cfytVar = cdwiVar.e;
        asjt asjtVar = cdwiVar.g;
        cdwh cdwhVar = cdwiVar.c;
        poj pojVar = poj.a;
        cevc cevcVar = cevc.WORKMANAGER_ONLY;
        Optional empty = Optional.empty();
        cdwg a = cdwhVar.a();
        babm babmVar = cdwiVar.f;
        return new cdwo(cdwiVar.b, pojVar, cdwiVar.a, a, cdvy.class, babmVar, obj, Object.class, parserForType, poaVar, asjtVar, Alert.DURATION_SHOW_INDEFINITELY, longValue, cevcVar, empty, null, cfytVar);
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
