package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import androidx.car.app.model.Alert;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Comparator;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciyv {
    public static final entd a = entd.c("BugleNotifications");
    public static final Map b;
    public static final Comparator c;
    public final Context d;
    public final errl e;
    public final errl f;
    public final cjci g;
    public final Optional h;
    public final cnjt i;
    public final Map j;
    public final cjat k;
    public final ayfg l;
    public final ciph m;
    public final cpde n;
    public final cpbw o;
    public final Optional p;
    public final Optional q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    private final ffbr u;
    private final bbff v;
    private final ffbr w;

    static {
        EnumMap enumMap = new EnumMap(ciux.class);
        b = enumMap;
        enumMap.put((EnumMap) ciux.NAT_COPY_OTP, (ciux) 0);
        enumMap.put((EnumMap) ciux.NAT_MARK_AS_READ, (ciux) 1);
        enumMap.put((EnumMap) ciux.NAT_DOWNLOAD_MMS, (ciux) 2);
        enumMap.put((EnumMap) ciux.NAT_NON_TEXT_SMART_ACTION, (ciux) 3);
        enumMap.put((EnumMap) ciux.NAT_TEXT_CLASSIFIER_ACTION, (ciux) 4);
        enumMap.put((EnumMap) ciux.NAT_QUICK_REPLY, (ciux) 5);
        enumMap.put((EnumMap) ciux.NAT_REMINDER, (ciux) 6);
        enumMap.put((EnumMap) ciux.NAT_WEARABLE_QUICK_REPLY, (ciux) 7);
        enumMap.put((EnumMap) ciux.NAT_WEARABLE_OPEN_CONVERSATION, (ciux) 8);
        enumMap.put((EnumMap) ciux.NAT_WEARABLE_CALL, (ciux) 9);
        c = Comparator.CC.comparing(new Function() { // from class: ciyr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Integer) Map.EL.getOrDefault(ciyv.b, ((ciuw) obj).b(), Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Comparator.CC.comparingInt(new ToIntFunction() { // from class: ciys
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                entd entdVar = ciyv.a;
                return ((Integer) Objects.requireNonNullElse((Integer) obj, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue();
            }
        }));
    }

    public ciyv(Context context, errl errlVar, errl errlVar2, cjci cjciVar, Optional optional, cnjt cnjtVar, ffbr ffbrVar, bbff bbffVar, java.util.Map map, cjat cjatVar, ayfg ayfgVar, ciph ciphVar, cpde cpdeVar, cpbw cpbwVar, ffbr ffbrVar2, Optional optional2, Optional optional3, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.d = context;
        this.e = errlVar;
        this.f = errlVar2;
        this.g = cjciVar;
        this.h = optional;
        this.i = cnjtVar;
        this.u = ffbrVar;
        this.v = bbffVar;
        this.j = map;
        this.k = cjatVar;
        this.l = ayfgVar;
        this.m = ciphVar;
        this.n = cpdeVar;
        this.o = cpbwVar;
        this.w = ffbrVar2;
        this.p = optional3;
        this.q = optional2;
        this.r = ffbrVar3;
        this.s = ffbrVar4;
        this.t = ffbrVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(boolean z, engw engwVar) {
        if (!z) {
            return false;
        }
        int size = engwVar.size();
        int i = 0;
        while (i < size) {
            int c2 = ((bcse) engwVar.get(i)).c();
            i++;
            if (c2 != 2) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return ((cvjg) this.w.b()).a() ? 2 : 1;
    }

    public final elfl b(ConversationIdType conversationIdType, cjay cjayVar, int i) {
        cixx cixxVar = (cixx) cjayVar;
        if (!cixxVar.e) {
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createDownloadMmsAction", 704, "IncomingMessageActionCreator.java")).q("Manual download not needed");
            return elfo.e(null);
        }
        MessageIdType messageIdType = cixxVar.f;
        boolean z = i == 1;
        if (messageIdType.c()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createDownloadMmsAction", 711, "IncomingMessageActionCreator.java")).q("Message id is empty, not creating download mms action");
            return elfo.e(null);
        }
        PendingIntent a2 = ((carb) this.u.b()).a().a(this.d, this.v.b(messageIdType, z), 119, true, bcqc.c(this.d, conversationIdType, messageIdType, new String[0]));
        Context context = this.d;
        return elfo.e(ciuw.n(ciux.NAT_DOWNLOAD_MMS, IconCompat.h(context, R.drawable.quantum_gm_ic_file_download_white_24), context.getString(R.string.im_notification_download_mms), a2, Optional.empty()).a());
    }
}
