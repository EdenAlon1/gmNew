package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wio extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ wiv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wio(wiv wivVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wivVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        wio wioVar = new wio(this.c, (ffgu) obj3);
        wioVar.a = booleanValue;
        wioVar.b = (win) obj2;
        return wioVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        if (!z || (this.c.b instanceof PenpalBotConversationId)) {
            int i = engw.d;
            return enou.a;
        }
        int ordinal = ((win) obj2).ordinal();
        if (ordinal == 0) {
            if (!((Boolean) ctjd.bp.e()).booleanValue() || ((asuf) this.c.a.b()).a()) {
                int i2 = engw.d;
                return enou.a;
            }
            fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
            fbwzVar.getClass();
            fbvb fbvbVar = (fbvb) fbvd.a.createBuilder();
            fbvbVar.getClass();
            fbpa.b(3, fbvbVar);
            fbro.b(fbpa.a(fbvbVar), fbwzVar);
            fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
            fbwxVar.getClass();
            fbrn.b(fbri.OPEN_MAGIC_COMPOSE, fbwxVar);
            fbro.c(fbrn.a(fbwxVar), fbwzVar);
            return engw.r(new SmartSuggestionItemSuggestionData(fbro.a(fbwzVar)));
        }
        if (ordinal != 2) {
            int i3 = engw.d;
            return enou.a;
        }
        if (!((Boolean) ctjd.bo.e()).booleanValue()) {
            int i4 = engw.d;
            return enou.a;
        }
        fbwz fbwzVar2 = (fbwz) fbxa.a.createBuilder();
        fbwzVar2.getClass();
        fbvb fbvbVar2 = (fbvb) fbvd.a.createBuilder();
        fbvbVar2.getClass();
        fbpa.b(4, fbvbVar2);
        fbro.b(fbpa.a(fbvbVar2), fbwzVar2);
        fbwx fbwxVar2 = (fbwx) fbwy.b.createBuilder();
        fbwxVar2.getClass();
        fbrn.b(fbri.OPEN_MAGIC_COMPOSE, fbwxVar2);
        fbro.c(fbrn.a(fbwxVar2), fbwzVar2);
        return engw.r(new SmartSuggestionItemSuggestionData(fbro.a(fbwzVar2)));
    }
}
