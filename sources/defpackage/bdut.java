package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdut {
    public static final SmartSuggestionItemSuggestionData a(bvfs bvfsVar) {
        bvfsVar.getClass();
        fbxa o = bvfsVar.o();
        fbwy fbwyVar = o.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        eyfq builder = fbwyVar.toBuilder();
        builder.getClass();
        fbwx fbwxVar = (fbwx) builder;
        fbwz fbwzVar = (fbwz) o.toBuilder();
        fbrd l = bvfsVar.l();
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).d = l.a();
        fbre m = bvfsVar.m();
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).e = m.a();
        fbwzVar.copyOnWrite();
        fbxa fbxaVar = (fbxa) fbwzVar.instance;
        fbwy fbwyVar2 = (fbwy) fbwxVar.build();
        fbwyVar2.getClass();
        fbxaVar.e = fbwyVar2;
        fbxaVar.b |= 1;
        eyfy build = fbwzVar.build();
        build.getClass();
        String q = bvfsVar.q();
        q.getClass();
        return new SmartSuggestionItemSuggestionData((fbxa) build, q, bduw.a);
    }
}
