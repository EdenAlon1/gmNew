package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dehp extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ deht d;
    final /* synthetic */ dehq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dehp(deht dehtVar, dehq dehqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = dehtVar;
        this.e = dehqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dehp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ffhh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ceyt i;
        ekzz ekzzVar;
        dehq dehqVar;
        dehq dehqVar2;
        ?? r0 = ffhh.a;
        int i2 = this.c;
        try {
            if (i2 == 0) {
                ffci.b(obj);
                deht dehtVar = this.d;
                dehq dehqVar3 = this.e;
                ekzz f = eleg.f("SyncConversationDataToWearableHandler#processPendingWorkItemAsync");
                try {
                    ConversationIdType b = bdgq.b(dehtVar.b);
                    ekzz f2 = eleg.f("SyncConversationDataToWearableHandler#getArchiveStatusFromConversationId");
                    try {
                        byyt byytVar = (byyt) bsom.j(b, new Function() { // from class: deho
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((bseh) obj2).G();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        ffig.a(f2, null);
                        if (byytVar == null) {
                            this.a = dehqVar3;
                            this.b = f;
                            this.c = 1;
                            obj = dehqVar3.k(b, this);
                            if (obj != r0) {
                                r0 = f;
                                dehqVar = dehqVar3;
                                i = (ceyt) obj;
                                ekzz f3 = eleg.f("SyncConversationDataToWearableHandler#logConversationDeletionSent");
                                entd entdVar = dehq.a;
                                ((akxl) ((cvhl) dehqVar.c.b()).a.b()).n(cvhl.a(2));
                                ffig.a(f3, null);
                                ekzzVar = r0;
                            }
                        } else if (byytVar != byyt.UNARCHIVED) {
                            this.a = dehqVar3;
                            this.b = f;
                            this.c = 2;
                            obj = dehqVar3.k(b, this);
                            if (obj != r0) {
                                r0 = f;
                                dehqVar2 = dehqVar3;
                                i = (ceyt) obj;
                                ekzz f4 = eleg.f("SyncConversationDataToWearableHandler#logConversationDeletionFromArchiveSent");
                                entd entdVar2 = dehq.a;
                                ((akxl) ((cvhl) dehqVar2.c.b()).a.b()).n(cvhl.a(3));
                                ffig.a(f4, null);
                                ekzzVar = r0;
                            }
                        } else {
                            ensk n = dehq.a.n();
                            n.Y(csux.O, "SyncConversationDataToWearableHandler");
                            n.Y(csux.p, b);
                            n.q("Skip syncing conversation deletion to data client.");
                            i = ceyt.i();
                            ekzzVar = f;
                        }
                        return r0;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r0 = f;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ffig.a(r0, th);
                        throw th2;
                    }
                }
            }
            if (i2 != 1) {
                Object obj2 = this.b;
                ?? r1 = this.a;
                ffci.b(obj);
                r0 = obj2;
                dehqVar2 = r1;
                i = (ceyt) obj;
                ekzz f42 = eleg.f("SyncConversationDataToWearableHandler#logConversationDeletionFromArchiveSent");
                try {
                    entd entdVar22 = dehq.a;
                    ((akxl) ((cvhl) dehqVar2.c.b()).a.b()).n(cvhl.a(3));
                    ffig.a(f42, null);
                    ekzzVar = r0;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                Object obj3 = this.b;
                ?? r12 = this.a;
                ffci.b(obj);
                r0 = obj3;
                dehqVar = r12;
                i = (ceyt) obj;
                ekzz f32 = eleg.f("SyncConversationDataToWearableHandler#logConversationDeletionSent");
                try {
                    entd entdVar3 = dehq.a;
                    ((akxl) ((cvhl) dehqVar.c.b()).a.b()).n(cvhl.a(2));
                    ffig.a(f32, null);
                    ekzzVar = r0;
                } finally {
                }
            }
            i.getClass();
            ffig.a(ekzzVar, null);
            return i;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dehp(this.d, this.e, ffguVar);
    }
}
