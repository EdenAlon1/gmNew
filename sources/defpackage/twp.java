package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twp implements ejuh {
    public final errl a;
    public final cqoh b;
    public final avff c;
    public final cowf d;
    public final cers e;
    private final errl h;
    private final ConversationIdType i;
    public ejug g = ejug.a;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public twp(errl errlVar, errl errlVar2, cqoh cqohVar, avff avffVar, cowf cowfVar, cers cersVar, ConversationIdType conversationIdType) {
        this.a = errlVar;
        this.h = errlVar2;
        this.b = cqohVar;
        this.c = avffVar;
        this.d = cowfVar;
        this.e = cersVar;
        this.i = conversationIdType;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ekzz f = eleg.f("MessageDataSource#BusinessInfoDataSource#LoadData");
        try {
            erph erphVar = new erph(erqt.i(this.g));
            f.a(erphVar);
            f.close();
            return erphVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        ekzz f = eleg.f("MessageDataSource#BusinessInfoDataSource#FetchAndStoreData");
        try {
            final bvvl b = txt.b(this.i);
            elfl h = elfo.g(new Callable() { // from class: twl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bvti bvtiVar = (bvti) bvvl.this.o();
                    try {
                        if (!bvtiVar.moveToFirst()) {
                            bvtiVar.close();
                            return Optional.empty();
                        }
                        Optional ofNullable = Optional.ofNullable(bvtiVar.r());
                        bvtiVar.close();
                        return ofNullable;
                    } catch (Throwable th) {
                        try {
                            bvtiVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.a).i(new eroh() { // from class: twn
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    if (optional.isEmpty()) {
                        return elfo.e(Optional.empty());
                    }
                    final twp twpVar = twp.this;
                    final String str = (String) optional.get();
                    return twpVar.c.a(str).h(new emwl() { // from class: twm
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            String str2 = str;
                            Optional optional2 = (Optional) obj2;
                            twp twpVar2 = twp.this;
                            if (!twpVar2.f.get()) {
                                cers cersVar = twpVar2.e;
                                cero ceroVar = (cero) cerr.a.createBuilder();
                                ceroVar.copyOnWrite();
                                ((cerr) ceroVar.instance).b = str2;
                                ceroVar.copyOnWrite();
                                ((cerr) ceroVar.instance).d = cerq.a(4);
                                ceroVar.copyOnWrite();
                                ((cerr) ceroVar.instance).c = cerp.a(4);
                                cerr cerrVar = (cerr) ceroVar.build();
                                cetp cetpVar = new cetp();
                                cetpVar.a = str2;
                                cetpVar.b = str2;
                                cersVar.b(cerrVar, cetpVar.a());
                                twpVar2.f.set(true);
                            }
                            return optional2.isPresent() ? optional2 : Optional.ofNullable(twpVar2.d.a(str2));
                        }
                    }, twpVar.a);
                }
            }, this.h).h(new emwl() { // from class: two
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    twp twpVar = twp.this;
                    Optional optional = (Optional) obj;
                    twpVar.g = ejug.a(optional, twpVar.b.f());
                    return optional;
                }
            }, this.h);
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return BusinessInfoDatabaseConstants.BusinessInfoTableConstants.TABLE_NAME;
    }
}
