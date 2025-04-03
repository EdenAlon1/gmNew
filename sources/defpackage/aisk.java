package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aisk extends ffhv implements ffjm {
    final /* synthetic */ aisn a;
    final /* synthetic */ buxm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisk(ffgu ffguVar, aisn aisnVar, buxm buxmVar) {
        super(2, ffguVar);
        this.a = aisnVar;
        this.b = buxmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        ffci.b(obj);
        bvvn e = ParticipantsTable.e();
        e.z("shouldFilter");
        e.h(new aism(this.b));
        bvti bvtiVar = (bvti) e.b().o();
        try {
            if (bvtiVar.getCount() == 0) {
                ffig.a(bvtiVar, null);
                z = true;
            } else {
                bvtiVar.moveToFirst();
                boolean isEmpty = TextUtils.isEmpty(((ParticipantsTable.BindData) bvtiVar.cO()).T());
                ffig.a(bvtiVar, null);
                z = isEmpty;
            }
            return Boolean.valueOf(z);
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aisk aiskVar = new aisk(ffguVar, this.a, this.b);
        aiskVar.c = obj;
        return aiskVar;
    }
}
