package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctkf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctko b;
    final /* synthetic */ SuggestionData c;
    final /* synthetic */ eoqz d;
    final /* synthetic */ fbqp e;
    final /* synthetic */ boolean f;
    final /* synthetic */ float g;
    final /* synthetic */ Boolean h;
    final /* synthetic */ Boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkf(ctko ctkoVar, SuggestionData suggestionData, eoqz eoqzVar, fbqp fbqpVar, boolean z, float f, Boolean bool, Boolean bool2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctkoVar;
        this.c = suggestionData;
        this.d = eoqzVar;
        this.e = fbqpVar;
        this.f = z;
        this.g = f;
        this.h = bool;
        this.i = bool2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctkf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        ctko ctkoVar = this.b;
        SuggestionData suggestionData = this.c;
        eoqz eoqzVar = this.d;
        fbqp fbqpVar = this.e;
        boolean z = this.f;
        float f = this.g;
        Boolean bool = this.h;
        Boolean bool2 = this.i;
        this.a = 1;
        if (ctkoVar.j(suggestionData, eoqzVar, fbqpVar, z, f, bool, bool2, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctkf(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ffguVar);
    }
}
