package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anza extends ffhv implements ffjm {
    int a;
    final /* synthetic */ anzb b;
    final /* synthetic */ apro c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anza(anzb anzbVar, apro aproVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = anzbVar;
        this.c = aproVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anza) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            long j = anzb.a;
            this.a = 1;
            if (ffsw.d(j, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        anzg anzgVar = (anzg) this.b.c.b();
        apro aproVar = this.c;
        anzc anzcVar = (anzc) anzd.a.createBuilder();
        anzcVar.getClass();
        String b = aproVar.d().f().b();
        b.getClass();
        anzcVar.copyOnWrite();
        anzd anzdVar = (anzd) anzcVar.instance;
        anzdVar.b = 1 | anzdVar.b;
        anzdVar.c = b;
        double b2 = aproVar.b();
        anzcVar.copyOnWrite();
        anzd anzdVar2 = (anzd) anzcVar.instance;
        anzdVar2.b |= 8;
        anzdVar2.f = b2;
        DesugarCollections.unmodifiableList(anzdVar2.d).getClass();
        engw i2 = aproVar.i();
        ArrayList arrayList = new ArrayList(ffdx.n(i2, 10));
        Iterator<E> it = i2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((apmq) it.next()).c()));
        }
        anzcVar.copyOnWrite();
        anzd anzdVar3 = (anzd) anzcVar.instance;
        eygr eygrVar = anzdVar3.d;
        if (!eygrVar.c()) {
            anzdVar3.d = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(arrayList, anzdVar3.d);
        apsd f = aproVar.f();
        MessageId messageId = f != null ? f.a : null;
        if (messageId != null) {
            anwv anwvVar = (anwv) anww.a.createBuilder();
            anwvVar.getClass();
            String a = messageId.a();
            a.getClass();
            anwvVar.copyOnWrite();
            ((anww) anwvVar.instance).b = a;
            eyfy build = anwvVar.build();
            build.getClass();
            anzcVar.copyOnWrite();
            anzd anzdVar4 = (anzd) anzcVar.instance;
            anzdVar4.e = (anww) build;
            anzdVar4.b |= 4;
        }
        eyfy build2 = anzcVar.build();
        build2.getClass();
        cetp cetpVar = new cetp();
        cetpVar.c = anzb.b;
        ((cevh) anzgVar.a.b()).a(ceyr.h("smarts_send_message_listener_handler", (anzd) build2, cetpVar.a()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anza(this.b, this.c, ffguVar);
    }
}
