package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akdv extends ffhv implements ffjm {
    final /* synthetic */ akee a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdv(ffgu ffguVar, akee akeeVar) {
        super(2, ffguVar);
        this.a = akeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akdv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        buxo d = MessagesTable.d();
        d.z("getOldestMessageTimestamp");
        Instant ofEpochMilli = Instant.ofEpochMilli(d.b().l(MessagesTable.c.i));
        ofEpochMilli.getClass();
        return eykn.b(ofEpochMilli);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akdv akdvVar = new akdv(ffguVar, this.a);
        akdvVar.b = obj;
        return akdvVar;
    }
}
