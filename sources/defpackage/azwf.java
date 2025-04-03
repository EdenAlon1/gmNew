package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azwf extends ContentProvider {
    private static final entd a = entd.c("Bugle");
    private final UriMatcher b = new UriMatcher(-1);

    /* compiled from: PG */
    public interface a {
        alit af();

        alkw ag();

        elbx b();

        cfus bU();

        cpxj cA();

        csvg cL();

        csxu cN();

        ctvb cR();

        ctze cT();

        cpar cw();

        ffbr gi();
    }

    static final void a(PrintWriter printWriter, String str, String str2) {
        printWriter.println(str.concat(":"));
        printWriter.println(str2);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, final PrintWriter printWriter, String[] strArr) {
        a aVar;
        String str;
        alko alkoVar;
        String str2;
        enhk c;
        Context context = getContext();
        context.getClass();
        a aVar2 = (a) ekhw.a(context, a.class);
        ekzm b = aVar2.b().b("BugleContentProviderInternal#dump");
        try {
            ekzz f = eleg.f("BugleContentProviderInternal#dumpTraced");
            try {
                List a2 = ersy.a("bugle.dump_gathers_psds_early", "bugle") ? ((cfzh) aVar2.gi().b()).a() : null;
                ekzz f2 = eleg.f("BugleContentProviderInternal#sqliteVersion");
                try {
                    a(printWriter, "Sqlite version", dtub.l(null));
                    f2.close();
                    ekzz f3 = eleg.f("BugleContentProviderInternal#defaultSmsApp");
                    try {
                        String q = aVar2.cR().q();
                        if (TextUtils.isEmpty(q)) {
                            q = "None";
                        }
                        a(printWriter, "Default SMS app", q);
                        f3.close();
                        csxu cN = aVar2.cN();
                        ekzz f4 = eleg.f("BugleContentProviderInternal#gServices");
                        try {
                            a(printWriter, "GServicesValues", cN.d());
                            f4.close();
                            ekzz f5 = eleg.f("BugleContentProviderInternal#phenotypeFlags");
                            try {
                                a(printWriter, "Phenotypes", aVar2.bU().a());
                                f5.close();
                                ekzz f6 = eleg.f("BugleContentProviderInternal#sharedPrefs");
                                try {
                                    final ctze cT = aVar2.cT();
                                    StringBuilder sb = new StringBuilder();
                                    if (cT.c.G()) {
                                        if (((SubscriptionManager) cT.b.getSystemService(SubscriptionManager.class)) == null) {
                                            ensk j = ctze.a.j();
                                            j.Y(ente.a, "Bugle");
                                            aVar = aVar2;
                                            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/prefs/common/BuglePrefsPrinter", "buildSubscriptionPreferenceMap", 139, "BuglePrefsPrinter.java")).q("Couldn't get a subscription manager. Per-subscription preferences won't be backed up/restored.");
                                            c = enoz.a;
                                        } else {
                                            aVar = aVar2;
                                            final enhd enhdVar = new enhd();
                                            cT.d.o(new ctwa() { // from class: ctzd
                                                @Override // defpackage.ctwa
                                                public final boolean a(int i) {
                                                    enhdVar.k(ctze.this.f.a(i).a(), Integer.valueOf(i));
                                                    return true;
                                                }
                                            });
                                            c = enhdVar.c();
                                        }
                                        Iterator<E> it = c.entrySet().iterator();
                                        while (it.hasNext()) {
                                            ctze.a((String) ((Map.Entry) it.next()).getKey(), cT.b, sb);
                                            sb.append("\n");
                                        }
                                    } else {
                                        aVar = aVar2;
                                        sb.append("No subscription prefs because NOT the default SMS app\n");
                                    }
                                    ctze.a(cT.e.a(), cT.b, sb);
                                    a(printWriter, "Settings (Preferences)", sb.toString());
                                    f6.close();
                                    ekzz f7 = eleg.f("BugleContentProviderInternal#ProvisioningFlags");
                                    try {
                                        a(printWriter, "Provisioning Flags", "");
                                        djai.t().k(printWriter);
                                        f7.close();
                                        ekzz f8 = eleg.f("BugleContentProviderInternal#carrierConfigs");
                                        try {
                                            a(printWriter, "Carrier configs", aVar.cw().c());
                                            f8.close();
                                            ekzz f9 = eleg.f("BugleContentProviderInternal#writeMessageStatusSection");
                                            try {
                                                if (((Boolean) cful.ah.e()).booleanValue()) {
                                                    byte[] b2 = aVar.af().b();
                                                    a(printWriter, "Message Status", b2 != null ? new String(b2) : "");
                                                }
                                                f9.close();
                                                ekzz f10 = eleg.f("BugleContentProviderInternal#writeAppEventsSection");
                                                try {
                                                    if (((Boolean) cful.ah.e()).booleanValue()) {
                                                        byte[] a3 = aVar.af().a();
                                                        a(printWriter, "App Events", a3 != null ? new String(a3) : "");
                                                    }
                                                    f10.close();
                                                    ekzz f11 = eleg.f("BugleContentProviderInternal#writeTelephonyWipeoutSection");
                                                    try {
                                                        cpxj cA = aVar.cA();
                                                        if (cA != null) {
                                                            cpxe a4 = cA.a();
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append("last recreated intent: ");
                                                            eyja eyjaVar = a4.c;
                                                            if (eyjaVar == null) {
                                                                eyjaVar = eyja.a;
                                                            }
                                                            sb2.append(cA.e(eyjaVar));
                                                            sb2.append("\nlast reverse sync: ");
                                                            eyja eyjaVar2 = a4.c;
                                                            if (eyjaVar2 == null) {
                                                                eyjaVar2 = eyja.a;
                                                            }
                                                            sb2.append(cA.e(eyjaVar2));
                                                            str = sb2.toString();
                                                        } else {
                                                            str = "N/A (LastWipeoutService was null).";
                                                        }
                                                        a(printWriter, "Telephony", str);
                                                        f11.close();
                                                        ekzz f12 = eleg.f("BugleContentProviderInternal#writeRecentMessageCodesSection");
                                                        try {
                                                            alkw ag = aVar.ag();
                                                            if (ag != null) {
                                                                try {
                                                                    alkoVar = (alko) ag.b.l();
                                                                } catch (eygu e) {
                                                                    csjb b3 = alkw.a.b();
                                                                    b3.I("Couldn't load RecentMessageCodes from SettingsStore.");
                                                                    b3.s(e);
                                                                    alkoVar = alko.a;
                                                                }
                                                                str2 = alkoVar.h.isEmpty() ? "No message codes logged." : (String) Collection.EL.stream(alkw.a(alkoVar).entrySet()).map(new Function() { // from class: alku
                                                                    @Override // java.util.function.Function
                                                                    /* renamed from: andThen */
                                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                                        return Function$CC.$default$andThen(this, function);
                                                                    }

                                                                    @Override // java.util.function.Function
                                                                    public final Object apply(Object obj) {
                                                                        Map.Entry entry = (Map.Entry) obj;
                                                                        return ((String) entry.getKey()) + ": " + ((String) entry.getValue());
                                                                    }

                                                                    public final /* synthetic */ Function compose(Function function) {
                                                                        return Function$CC.$default$compose(this, function);
                                                                    }
                                                                }).collect(Collectors.joining("\n"));
                                                            } else {
                                                                str2 = "N/A (RecentMessageCodesService was null).";
                                                            }
                                                            a(printWriter, "Recent Message Codes", str2);
                                                            f12.close();
                                                            ekzz f13 = eleg.f("BugleContentProviderInternal#writePsdSection");
                                                            try {
                                                                printWriter.println("** PSDs Log **");
                                                                if (a2 == null) {
                                                                    a2 = ((cfzh) aVar.gi().b()).a();
                                                                }
                                                                Iterator it2 = a2.iterator();
                                                                while (it2.hasNext()) {
                                                                    try {
                                                                        printWriter.println((String) ((elfl) it2.next()).get(1L, TimeUnit.SECONDS));
                                                                    } catch (Exception e2) {
                                                                        printWriter.printf("\nAdding PSD section failed, %s\n", e2.toString());
                                                                    }
                                                                }
                                                                f13.close();
                                                                printWriter.println("** Messages Log **");
                                                                ekzz f14 = eleg.f("BugleContentProviderInternal#writeLogUtilLogData");
                                                                try {
                                                                    csjy.e(context, cN, printWriter, csjz.BUGLE);
                                                                    f14.close();
                                                                    f4 = eleg.f("BugleContentProviderInternal#writeFloggerLogData");
                                                                    try {
                                                                        printWriter.println("** Messages Flogger Log **");
                                                                        try {
                                                                            final csvg cL = aVar.cL();
                                                                            elfl.g(cL.b.a().e(eldl.g(new erow() { // from class: csvf
                                                                                @Override // defpackage.erow
                                                                                public final Object a(erpc erpcVar, Object obj) {
                                                                                    IOException iOException;
                                                                                    InputStream inputStream = (InputStream) obj;
                                                                                    csvg csvgVar = csvg.this;
                                                                                    long epochMilli = csvgVar.e.f().toEpochMilli();
                                                                                    PrintWriter printWriter2 = printWriter;
                                                                                    long j2 = 0;
                                                                                    try {
                                                                                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                                                                                        try {
                                                                                            char[] cArr = new char[8192];
                                                                                            while (true) {
                                                                                                int read = inputStreamReader.read(cArr, 0, 8192);
                                                                                                if (read < 0) {
                                                                                                    break;
                                                                                                }
                                                                                                printWriter2.write(cArr, 0, read);
                                                                                                j2 += read;
                                                                                            }
                                                                                            inputStreamReader.close();
                                                                                        } catch (Throwable th) {
                                                                                            long j3 = j2;
                                                                                            try {
                                                                                                try {
                                                                                                    inputStreamReader.close();
                                                                                                    throw th;
                                                                                                } catch (Throwable th2) {
                                                                                                    th.addSuppressed(th2);
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (IOException e3) {
                                                                                                iOException = e3;
                                                                                                j2 = j3;
                                                                                                ((ensz) ((ensz) ((ensz) csvg.a.j()).g(iOException)).h("com/google/android/apps/messaging/shared/util/flogger/FloggerUtil", "dumpFloggerLogData", 'd', "FloggerUtil.java")).q("Failed to dump flogger logs");
                                                                                                printWriter2.println(String.format(Locale.ENGLISH, "Flogger Dump: %dms bytes: %d", Long.valueOf(csvgVar.e.f().minusMillis(epochMilli).toEpochMilli()), Long.valueOf(j2)));
                                                                                                return null;
                                                                                            }
                                                                                        }
                                                                                    } catch (IOException e4) {
                                                                                        iOException = e4;
                                                                                    }
                                                                                    printWriter2.println(String.format(Locale.ENGLISH, "Flogger Dump: %dms bytes: %d", Long.valueOf(csvgVar.e.f().minusMillis(epochMilli).toEpochMilli()), Long.valueOf(j2)));
                                                                                    return null;
                                                                                }
                                                                            }), cL.d).g()).get(10L, TimeUnit.SECONDS);
                                                                        } catch (Exception e3) {
                                                                            printWriter.printf("\nAdding Flogger logs failed, %s\n", e3.toString());
                                                                            ((ensz) ((ensz) ((ensz) a.j()).g(e3)).h("com/google/android/apps/messaging/shared/datamodel/BugleContentProviderInternal$BugleContentProviderInternalInternal", "writeFloggerLogData", (char) 435, "BugleContentProviderInternal.java")).q("Failed to add flogger logs to bug report");
                                                                        }
                                                                        f4.close();
                                                                        f.close();
                                                                        b.close();
                                                                    } finally {
                                                                    }
                                                                } finally {
                                                                }
                                                            } finally {
                                                                try {
                                                                    f13.close();
                                                                    throw th;
                                                                } catch (Throwable th) {
                                                                    th.addSuppressed(th);
                                                                }
                                                            }
                                                        } finally {
                                                            try {
                                                                f12.close();
                                                                throw th;
                                                            } catch (Throwable th2) {
                                                                th.addSuppressed(th2);
                                                            }
                                                        }
                                                    } finally {
                                                        try {
                                                            f11.close();
                                                            throw th;
                                                        } catch (Throwable th3) {
                                                            th.addSuppressed(th3);
                                                        }
                                                    }
                                                } finally {
                                                    try {
                                                        f10.close();
                                                        throw th;
                                                    } catch (Throwable th4) {
                                                        th.addSuppressed(th4);
                                                    }
                                                }
                                            } finally {
                                                try {
                                                    f9.close();
                                                    throw th;
                                                } catch (Throwable th5) {
                                                    th.addSuppressed(th5);
                                                }
                                            }
                                        } finally {
                                            try {
                                                f8.close();
                                                throw th;
                                            } catch (Throwable th6) {
                                                th.addSuppressed(th6);
                                            }
                                        }
                                    } finally {
                                        try {
                                            f7.close();
                                            throw th;
                                        } catch (Throwable th7) {
                                            th.addSuppressed(th7);
                                        }
                                    }
                                } finally {
                                    try {
                                        f6.close();
                                        throw th;
                                    } catch (Throwable th8) {
                                        th.addSuppressed(th8);
                                    }
                                }
                            } finally {
                                try {
                                    f5.close();
                                    throw th;
                                } catch (Throwable th9) {
                                    th.addSuppressed(th9);
                                }
                            }
                        } finally {
                            try {
                                f4.close();
                                throw th;
                            } catch (Throwable th10) {
                                th.addSuppressed(th10);
                            }
                        }
                    } finally {
                        try {
                            f3.close();
                            throw th;
                        } catch (Throwable th11) {
                            th.addSuppressed(th11);
                        }
                    }
                } finally {
                    try {
                        f2.close();
                        throw th;
                    } catch (Throwable th12) {
                        th.addSuppressed(th12);
                    }
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("getType not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        context.getClass();
        this.b.addURI(azwg.a(context), "conversation_images/*", 50);
        this.b.addURI(azwg.a(context), "draft_images/*", 60);
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        throw new UnsupportedOperationException("openFile not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (uri.getPathSegments().size() != 2) {
            throw new IllegalArgumentException("Malformed URI ".concat(String.valueOf(String.valueOf(uri))));
        }
        String[] strArr3 = brps.a;
        brpr brprVar = new brpr();
        brprVar.aq(new dtrt("conversation_image_parts_view.conversation_id_messages", 1, Long.valueOf(bdgq.a(bdgq.b(uri.getPathSegments().get(1))))));
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("conversation_image_parts_view");
        int match = this.b.match(uri);
        if (match == 50) {
            brprVar.aq(new dtrx("conversation_image_parts_view.uri_parts", 6));
            brprVar.aq(new dtwe("conversation_image_parts_view.status_messages", 2, 3));
            if (cubs.f()) {
                byyz[] byyzVarArr = {byyz.DEFAULT_NO_VERDICT, byyz.NEGATIVE_VERDICT_DISPLAY_IMAGE, byyz.POSITIVE_VERDICT_DISPLAY_IMAGE};
                int intValue = brps.b().intValue();
                if (intValue < 60240) {
                    dtub.w("image_display_state", intValue);
                }
                brprVar.aq(new dtrw("conversation_image_parts_view.image_display_state_parts", 3, brpr.at((Iterable) DesugarArrays.stream(byyzVarArr).map(new Function() { // from class: brpq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((byyz) obj).ordinal());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: brpp
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }))), true));
            }
        } else {
            if (match != 60) {
                throw new IllegalArgumentException("Unknown URI ".concat(String.valueOf(String.valueOf(uri))));
            }
            brprVar.aq(new dtwe("conversation_image_parts_view.status_messages", 1, 3));
        }
        sQLiteQueryBuilder.appendWhere(new brpo(brprVar).a(dtzu.b()));
        Cursor query = sQLiteQueryBuilder.query(dtub.e("$primary").j(), strArr, str, strArr2, null, null, str2, null);
        query.setNotificationUri(getContext().getContentResolver(), uri);
        return query;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not supported: ".concat(String.valueOf(String.valueOf(uri))));
    }
}
