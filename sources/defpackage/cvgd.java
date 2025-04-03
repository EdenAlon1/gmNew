package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.telecom.PhoneAccount;
import android.telephony.PhoneNumberUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvgd {
    public static final cskc a = cskc.g("Bugle", "VilteVideoCalling");
    public final Context b;
    public final ffbr c;
    private final errl d;

    public cvgd(Context context, ffbr ffbrVar, errl errlVar) {
        this.b = context;
        this.c = ffbrVar;
        this.d = errlVar;
    }

    final elfl a(final List list) {
        return elfo.g(new Callable() { // from class: cvgc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cvgd cvgdVar = cvgd.this;
                PhoneAccount a2 = ((cvex) cvgdVar.c.b()).a();
                List<ParticipantsTable.BindData> list2 = list;
                if (a2 == null || !a2.hasCapabilities(8) || !a2.hasCapabilities(256) || list2.isEmpty()) {
                    return list2;
                }
                String[] strArr = {"data1", "carrier_presence"};
                HashSet hashSet = new HashSet();
                emww emwwVar = new emww(",");
                Stream map = Collection.EL.stream(list2).map(new Function() { // from class: cvga
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(((ParticipantsTable.BindData) obj).u());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                try {
                    Cursor a3 = new bcqd(cvgdVar.b, ContactsContract.Data.CONTENT_URI, strArr, "contact_id IN (" + emwwVar.b((Iterable) map.collect(endq.a)) + ") AND mimetype=?", new String[]{"vnd.android.cursor.item/phone_v2"}, null).a();
                    if (a3 != null) {
                        while (a3.moveToNext()) {
                            try {
                                if ((1 & a3.getInt(1)) != 0) {
                                    hashSet.add(PhoneNumberUtils.normalizeNumber(a3.getString(0)));
                                }
                            } finally {
                            }
                        }
                    }
                    if (a3 != null) {
                        a3.close();
                    }
                } catch (Exception e) {
                    cvgd.a.s("Failed to retrieve ViLTE video reachability", e);
                }
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (ParticipantsTable.BindData bindData : list2) {
                    String S = bindData.S();
                    if (hashSet.contains(bindData.U())) {
                        arrayList.add(S);
                    } else {
                        arrayList2.add(bindData);
                    }
                }
                bvvr f = ParticipantsTable.f();
                f.ak();
                f.ap("updateReachability");
                f.T(2);
                f.V(new Function() { // from class: cvgb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvvw bvvwVar = (bvvw) obj;
                        bvvwVar.m(arrayList);
                        return bvvwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                f.b().e();
                return arrayList2;
            }
        }, this.d);
    }

    public final boolean b() {
        PhoneAccount a2 = ((cvex) this.c.b()).a();
        if (a2 == null) {
            return false;
        }
        boolean hasCapabilities = a2.hasCapabilities(1024);
        boolean hasCapabilities2 = a2.hasCapabilities(8);
        csjb a3 = a.a();
        a3.I("Phone account has CAPABILITY_SUPPORTS_VIDEO_CALLING: ");
        a3.J(hasCapabilities);
        a3.I(" has CAPABILITY_VIDEO_CALLING: ");
        a3.J(hasCapabilities2);
        a3.r();
        return hasCapabilities && hasCapabilities2;
    }

    final boolean c(aoku aokuVar) {
        cfva cfvaVar = aoqm.a;
        String p = aokuVar.p(((Boolean) new aopb().get()).booleanValue());
        if (p == null) {
            a.r("Fail to get destination from messageIdentity.");
            return false;
        }
        Intent intent = new Intent("android.intent.action.CALL", Uri.fromParts("tel", p, null));
        intent.putExtra("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        try {
            this.b.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
