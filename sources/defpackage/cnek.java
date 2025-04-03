package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnek extends ffhv implements ffjn {
    int a;
    final /* synthetic */ cneq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnek(cneq cneqVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = cneqVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cnek cnekVar = new cnek(this.b, (ffgu) obj3);
        cnekVar.c = (cneh) obj;
        return cnekVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj2 = this.c;
            cneq cneqVar = this.b;
            cneh cnehVar = (cneh) obj2;
            ConversationIdType b = bdgq.b(cnehVar.c);
            String str = cnehVar.d;
            str.getClass();
            MessageIdType b2 = bdhb.b(cnehVar.e);
            Duration ofMillis = Duration.ofMillis(cnehVar.g);
            ofMillis.getClass();
            fbwv fbwvVar = cnehVar.f;
            if (fbwvVar == null) {
                fbwvVar = fbwv.a;
            }
            fbwv fbwvVar2 = fbwvVar;
            fbwvVar2.getClass();
            this.a = 1;
            if (cneqVar.b(b, str, b2, ofMillis, fbwvVar2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ceyt.i();
    }
}
