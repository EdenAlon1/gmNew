package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crqw {
    public static volatile boolean b;
    static boolean c;
    public final Context d;
    public final errl e;
    public final errl f;
    private final ffbr h;
    private final ffbr i;
    public static final entd a = entd.c("BugleBlock");
    private static final Lock g = new ReentrantLock();

    public crqw(Context context, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2) {
        this.d = context;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.e = errlVar;
        this.f = errlVar2;
    }

    public final void a(final Context context, final Class cls) {
        axnw.h(elfo.g(new Callable() { // from class: crqr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean c2;
                if (crqw.b) {
                    ((ensz) ((ensz) crqw.a.h()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "haveSystemBlockList", 77, "BlockedParticipantsUtil.java")).q("BlockedParticipantsUtil#haveSystemBlockList: debugUseLocalBlocking is true");
                    c2 = false;
                } else {
                    c2 = crqw.this.c();
                }
                return Boolean.valueOf(c2);
            }
        }, this.f).h(new emwl() { // from class: crqs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Intent createManageBlockedNumbersIntent;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Context context2 = context;
                if (booleanValue) {
                    crqw crqwVar = crqw.this;
                    if (!crqwVar.d()) {
                        bvvn e = ParticipantsTable.e();
                        e.z("launchBlockedContacts");
                        e.h(new Function() { // from class: crqn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bvvw bvvwVar = (bvvw) obj2;
                                entd entdVar = crqw.a;
                                bvvwVar.c();
                                return bvvwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        if (e.b().V()) {
                            crqwVar.b(true);
                        }
                    }
                    TelecomManager telecomManager = (TelecomManager) context2.getSystemService("telecom");
                    try {
                        telecomManager.getClass();
                        createManageBlockedNumbersIntent = telecomManager.createManageBlockedNumbersIntent();
                        eldl.p(context2, createManageBlockedNumbersIntent);
                        return null;
                    } catch (Throwable unused) {
                        ((ensz) ((ensz) crqw.a.h()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "launchBlockedContacts", 130, "BlockedParticipantsUtil.java")).q("launchBlockedContacts: haveSystemBlockList but failed to open");
                    }
                }
                eldl.p(context2, new Intent(context2, (Class<?>) cls));
                return null;
            }
        }, this.e));
    }

    public final void b(boolean z) {
        Lock lock = g;
        lock.lock();
        try {
            if (b) {
                if (!z) {
                    z = false;
                }
                lock.unlock();
            }
            ((ctyx) this.h.b()).h("app_already_migrated_blocked_contacts", z);
            c = z;
            lock.unlock();
        } catch (Throwable th) {
            g.unlock();
            throw th;
        }
    }

    public final boolean c() {
        boolean d = ((ctvs) this.i.b()).d();
        boolean h = ctid.h(this.d);
        boolean z = !h;
        boolean z2 = false;
        if (d && !h) {
            z2 = true;
        }
        if (!z2) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "canAttemptToQuerySystemBlockList", 207, "BlockedParticipantsUtil.java")).I("BlockedParticipantsUtil#isDefaultAppAndPrimaryUser isDefaultSmsApp: %b | isPrimaryUser: %b", d, z);
        }
        return z2;
    }

    public final boolean d() {
        boolean z;
        Lock lock = g;
        lock.lock();
        try {
            if (c) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "haveMigratedContacts", 161, "BlockedParticipantsUtil.java")).q("BlockedParticipantsUtil#shouldUseSystemBlockedContacts: blocked contacts already migrated");
                z = true;
            } else {
                c = ((ctyx) this.h.b()).q("app_already_migrated_blocked_contacts", false);
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "haveMigratedContacts", 172, "BlockedParticipantsUtil.java")).t("BlockedParticipantsUtil#shouldUseSystemBlockedContacts: check haveMigratedContacts from prefs: %b", Boolean.valueOf(c));
                z = c;
            }
            lock.unlock();
            return z;
        } catch (Throwable th) {
            g.unlock();
            throw th;
        }
    }

    final boolean e() {
        if (c()) {
            return d();
        }
        return false;
    }
}
