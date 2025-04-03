package com.google.android.apps.messaging.shared.datamodel.data;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseDeserializer;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import defpackage.asmj;
import defpackage.aswd;
import defpackage.awap;
import defpackage.axnw;
import defpackage.azei;
import defpackage.bcpr;
import defpackage.bcql;
import defpackage.bcwy;
import defpackage.bcwz;
import defpackage.bcxc;
import defpackage.bdos;
import defpackage.bdot;
import defpackage.bjvm;
import defpackage.bvwp;
import defpackage.bvwq;
import defpackage.byyp;
import defpackage.byyu;
import defpackage.byyz;
import defpackage.byza;
import defpackage.byzc;
import defpackage.bzaq;
import defpackage.cbar;
import defpackage.cglt;
import defpackage.cjja;
import defpackage.coxi;
import defpackage.cpaz;
import defpackage.cqoh;
import defpackage.csix;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.cskt;
import defpackage.csuu;
import defpackage.cswf;
import defpackage.ctap;
import defpackage.ctel;
import defpackage.ctfn;
import defpackage.ctyz;
import defpackage.cubs;
import defpackage.cuxu;
import defpackage.drso;
import defpackage.dteh;
import defpackage.efbd;
import defpackage.eldl;
import defpackage.emwl;
import defpackage.eobe;
import defpackage.eohh;
import defpackage.eppr;
import defpackage.errl;
import defpackage.eyfy;
import defpackage.eygu;
import defpackage.ffbr;
import defpackage.le;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class MessagePartData extends bcpr implements MessagePartCoreData {
    public final Context b;
    public final Optional c;
    public final asmj d;
    public final ffbr e;
    public bvwp f;
    public String g;
    public transient eppr h;
    private final cbar i;
    private final ffbr j;
    private final cpaz k;
    private final bcwz l;
    private final ctap m;
    private final cqoh n;
    private final ctyz o;
    private final csuu p;
    private final cswf q;
    private final ctfn r;
    private final errl s;
    private final aswd t;
    private final boolean u;
    private final boolean v;
    private boolean w;
    private transient drso x;
    private VmtTable.BindData y;
    private long z;
    public static final cskc a = cskc.g("BugleDataModel", "MessagePartData");
    public static final Parcelable.Creator<MessagePartCoreData> CREATOR = new bcwy();

    /* compiled from: PG */
    public interface a {
        bcwz by();
    }

    public MessagePartData(cbar cbarVar, ffbr ffbrVar, cpaz cpazVar, bcwz bcwzVar, ctap ctapVar, cqoh cqohVar, ctyz ctyzVar, Context context, csuu csuuVar, cswf cswfVar, Optional optional, ctfn ctfnVar, errl errlVar, asmj asmjVar, ffbr ffbrVar2, Parcel parcel, aswd aswdVar) {
        this.i = cbarVar;
        this.j = ffbrVar;
        this.k = cpazVar;
        this.l = bcwzVar;
        this.m = ctapVar;
        this.n = cqohVar;
        this.o = ctyzVar;
        this.b = context;
        this.p = csuuVar;
        this.q = cswfVar;
        this.c = optional;
        this.r = ctfnVar;
        this.s = errlVar;
        this.d = asmjVar;
        this.e = ffbrVar2;
        this.t = aswdVar;
        this.f = PartsTable.BindData.CREATOR.createFromParcel(parcel).w();
        this.g = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            try {
                this.h = (eppr) eyfy.parseFrom(eppr.a, bArr);
            } catch (eygu e) {
                a.o("Unable to parse AttachmentInfo", e);
            }
        }
        if (parcel.readInt() > 0) {
            this.y = (VmtTable.BindData) parcel.readParcelable(VmtTable.BindData.class.getClassLoader());
        }
        if (parcel.dataAvail() > 0) {
            boolean z = parcel.readInt() == 1;
            this.u = z;
            if (aswdVar.a()) {
                this.f.M(z);
            }
        } else {
            if (aswdVar.a()) {
                this.f.M(false);
            }
            this.u = false;
        }
        if (parcel.dataAvail() > 0) {
            this.v = parcel.readInt() == 1;
        } else {
            this.v = false;
        }
        this.z = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
    }

    public static boolean bE(List list) {
        return bW(list, eohh.RICH_CARD);
    }

    public static boolean bF(List list) {
        return bW(list, eohh.RICH_CARD_CAROUSEL);
    }

    private final Rect bR(Uri uri, String str) {
        csix.h();
        if (str == null) {
            a.r("The content type is null");
            return null;
        }
        if (!le.n(str)) {
            a.r("The content type is not an image: ".concat(str));
            return null;
        }
        if (uri == null || uri == Uri.EMPTY) {
            a.r("The image uri is null");
            return null;
        }
        if (!csuu.x(uri)) {
            a.r("The image uri is not local");
            return null;
        }
        Rect h = this.m.h(uri, str);
        if (h.width() == -1) {
            a.r("The image width is null");
            return null;
        }
        if (h.height() != -1) {
            return h;
        }
        a.r("The image height is null");
        return null;
    }

    private static String bS(bvwp bvwpVar) {
        if (!bV(bvwpVar)) {
            if (bvwpVar.s == eobe.a && bvwpVar.t == eobe.a && bU(bvwpVar)) {
                return null;
            }
            return bvwpVar.c;
        }
        boolean bV = bV(bvwpVar);
        csix.k(bV);
        String str = bvwpVar.c;
        if (TextUtils.isEmpty(str) || !bV) {
            return null;
        }
        ConversationSuggestionResponse deserializeFromJson = ConversationSuggestionResponseDeserializer.deserializeFromJson(str);
        if (deserializeFromJson != null && !TextUtils.isEmpty(deserializeFromJson.displayText)) {
            return deserializeFromJson.displayText;
        }
        csjb e = a.e();
        e.I("Unable to extract display text from suggestion response:");
        e.I(str);
        e.r();
        return null;
    }

    private final void bT() {
        efbd.b();
        Uri uri = this.f.d;
        if (uri == null || !csuu.x(uri)) {
            return;
        }
        aw(csuu.c(this.b, uri));
    }

    private static boolean bU(bvwp bvwpVar) {
        return (TextUtils.isEmpty(bvwpVar.e) || le.x(bvwpVar.e) || bV(bvwpVar)) ? false : true;
    }

    private static boolean bV(bvwp bvwpVar) {
        return RbmSuggestionResponse.CONTENT_TYPE.equals(bvwpVar.e);
    }

    private static boolean bW(List list, eohh eohhVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (RbmSpecificMessage.CONTENT_TYPE.equals(messagePartCoreData.V()) && messagePartCoreData.N() == eohhVar) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final ConversationIdType A() {
        return this.f.o;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final MessageIdType B() {
        return this.f.b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final bdot C() {
        Uri uri;
        Uri x;
        String ab;
        String V = V();
        if (t() != null) {
            x = t();
            ab = V();
        } else {
            if (x() == null) {
                uri = null;
                return new bdos(V, uri);
            }
            x = x();
            ab = ab();
        }
        String str = ab;
        uri = x;
        V = str;
        return new bdos(V, uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public MessagePartCoreData D() {
        MessagePartData b = this.l.b(this);
        if (((Boolean) cjja.a.e()).booleanValue()) {
            b.x = this.x;
        }
        return b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final PartsTable.BindData E() {
        return this.f.a();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final VmtTable.BindData F() {
        return this.y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byyu G() {
        return this.f.n;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byyz H() {
        return this.f.Y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byza I() {
        return this.f.T;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byzc J() {
        return this.f.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final LocationInformation K() {
        if (!bp()) {
            return null;
        }
        Location location = new Location("Bugler");
        location.setLongitude(this.f.s);
        location.setLatitude(this.f.t);
        LocationInformation locationInformation = new LocationInformation(location, null);
        String str = this.g;
        if (cuxu.b(str)) {
            locationInformation.a = str;
        }
        return locationInformation;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final drso L() {
        return this.x;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final dteh M() {
        return (dteh) Objects.requireNonNullElse(this.f.U, dteh.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final eohh N() {
        eohh b = eohh.b(this.f.x);
        return b == null ? eohh.UNKNOWN : b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final eppr O() {
        return this.h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String P() {
        return this.f.A;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String Q() {
        return this.f.z;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String R() {
        return this.f.K;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String S() {
        return this.f.B;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String T() {
        return this.f.J;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String U() {
        Resources resources = this.b.getResources();
        if (bD()) {
            return resources.getString(R.string.message_video_content_description);
        }
        if (!bo()) {
            return null;
        }
        int i = this.f.x;
        if (i == 11 || i == 26) {
            return resources.getString(R.string.message_sticker_content_description);
        }
        if (i != 46 && i != 42 && i != 43) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    return resources.getString(R.string.message_location_content_description);
                default:
                    return null;
            }
        }
        return resources.getString(R.string.message_image_content_description);
    }

    @Override // defpackage.bdov
    public final String V() {
        return this.f.e;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String W() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String X() {
        return this.f.G;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String Y() {
        return this.f.H;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String Z() {
        return this.f.S;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final int a() {
        return this.f.y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aA(byte[] bArr) {
        this.f.G(bArr);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aB(byza byzaVar) {
        this.f.I(byzaVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aC(drso drsoVar) {
        this.x = drsoVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aD(Uri uri) {
        this.f.L(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aE(Uri uri) {
        this.f.Q(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aF(long j) {
        this.z = j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aG(awap awapVar) {
        this.f.P(awapVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aH(byzc byzcVar) {
        this.f.R(byzcVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aI(String str) {
        this.f.U(new byyp(str));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aJ(long j) {
        this.f.X(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aK(String str) {
        if (!TextUtils.isEmpty(str) && bt()) {
            str = str.trim();
        }
        this.f.Y(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aL(dteh dtehVar) {
        this.f.ac(dtehVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aM(VmtTable.BindData bindData) {
        this.y = bindData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aN(Context context) {
        csix.k(le.x(this.f.e));
        bvwp bvwpVar = this.f;
        bvwpVar.Y(this.k.a(context, bvwpVar.c));
        this.g = bS(this.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aO(PartsTable.BindData bindData) {
        this.f.f(bindData.C());
        this.f.g(bindData.D());
        this.f.i(bindData.o());
        this.f.h(bindData.N());
        this.f.G(bindData.R());
        this.f.p(bindData.G());
        this.f.r(bindData.q());
        this.f.s(bindData.Q());
        this.f.q(bindData.O());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aP(ConversationIdType conversationIdType) {
        this.f.u(conversationIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aQ(MessageIdType messageIdType) {
        this.f.J(messageIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aR(String str) {
        boolean z = false;
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(aa())) {
            z = true;
        }
        csix.k(z);
        this.f.B(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aS(MessagePartCoreData messagePartCoreData) {
        this.f.aa(messagePartCoreData.t());
        this.f.Q(messagePartCoreData.w());
        this.f.X(messagePartCoreData.p());
        this.f.R(messagePartCoreData.J());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aT() {
        if (this.v) {
            return bo() || bD();
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aU() {
        if (bt() && this.o.i()) {
            Optional a2 = cglt.a(this.g);
            if (a2.isPresent() && cuxu.b((String) a2.get())) {
                return false;
            }
        }
        return aZ();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aV() {
        return this.f.E;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aW() {
        return this.f.L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aX() {
        return (TextUtils.isEmpty(this.g) || bh()) ? false : true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aY() {
        return !TextUtils.isEmpty(Y());
    }

    @Override // defpackage.bdov
    public final boolean aZ() {
        return bU(this.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String aa() {
        return this.f.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String ab() {
        return this.f.v;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String ac() {
        return this.f.q.toString();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String ad() {
        return this.f.p.toString();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String ae() {
        return this.f.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void af() {
        this.f = this.f.a().x();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ag() {
        efbd.b();
        if (ba()) {
            bT();
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ah() {
        efbd.b();
        if (bD()) {
            bT();
        }
    }

    @Override // defpackage.bdov
    public final void ai() {
        csix.h();
        Rect bR = bR(this.f.d, V());
        if (bR != null) {
            this.f.ad(bR.width());
            this.f.A(bR.height());
        }
    }

    public final void aj() {
        csix.h();
        Uri uri = this.f.d;
        csix.h();
        Point point = null;
        if (V() == null) {
            a.r("The content type is null.");
        } else if (bD() && uri != null && csuu.x(uri)) {
            ctfn ctfnVar = this.r;
            Point point2 = (Point) ctel.c(ctfnVar.a, uri, new emwl() { // from class: ctes
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ctet.b((ctel) obj);
                }
            }, new Point(-1, -1));
            if (point2.x != -1 && point2.y != -1) {
                point = point2;
            }
        }
        if (point != null) {
            this.f.ad(point.x);
            this.f.A(point.y);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ak() {
        final Uri y = y();
        if (y != null) {
            axnw.h(this.s.submit(eldl.l(new Runnable() { // from class: bcwx
                @Override // java.lang.Runnable
                public final void run() {
                    MessagePartData messagePartData = MessagePartData.this;
                    final Uri uri = y;
                    try {
                        final int delete = messagePartData.b.getContentResolver().delete(uri, null, null);
                        if (messagePartData.d.a()) {
                            ((azei) messagePartData.e.b()).d(new Consumer() { // from class: bcwv
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    ((cpdd) obj).a(uri, null, null, delete);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        } else {
                            messagePartData.c.ifPresent(new Consumer() { // from class: bcww
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    ((cpdd) ((ffbr) obj).b()).a(uri, null, null, delete);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    } catch (SecurityException e) {
                        MessagePartData.a.o("Unable to remove message part data content.", e);
                    }
                }
            })));
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void al() {
        final Uri y = y();
        if (y != null) {
            try {
                final int delete = this.b.getContentResolver().delete(y, null, null);
                if (this.d.a()) {
                    ((azei) this.e.b()).d(new Consumer() { // from class: bcwt
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((cpdd) obj).a(y, null, null, delete);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } else {
                    this.c.ifPresent(new Consumer() { // from class: bcwu
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((cpdd) ((ffbr) obj).b()).a(y, null, null, delete);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            } catch (SecurityException e) {
                a.o("Unable to remove message part data content.", e);
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void am(String str) {
        bO();
        aI(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void an(eppr epprVar) {
        this.h = epprVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ao(String str) {
        this.f.g(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ap(long j) {
        this.f.i(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aq(String str) {
        this.f.p(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ar(long j) {
        this.f.r(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void as(byte[] bArr) {
        this.f.s(bArr);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void at(String str) {
        this.f.t(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void au(Uri uri) {
        this.f.aa(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void av(ConversationIdType conversationIdType) {
        this.f.u(conversationIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aw(long j) {
        this.f.v(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ax(String str) {
        this.f.w(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ay(Uri uri) {
        this.f.x(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void az(String str) {
        if (str != null) {
            this.f.y(str);
        }
    }

    @Override // defpackage.bdov
    public final int b() {
        return this.f.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bA() {
        return le.x(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bB() {
        return le.y(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bC() {
        return le.z(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, defpackage.bdov
    public final boolean bD() {
        return le.A(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bG(Uri uri) {
        Uri t = t();
        if (t != null && t.equals(uri)) {
            return true;
        }
        Uri v = v();
        return v != null && v.equals(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bH(MessagePartCoreData messagePartCoreData) {
        return bG(messagePartCoreData.t()) || bG(messagePartCoreData.v());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byte[] bI() {
        return this.f.D;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byte[] bJ() {
        return this.f.C;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byte[] bK() {
        return this.f.O;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byte[] bL() {
        return this.f.N;
    }

    public final InputStream bM(Uri uri) {
        return this.p.k(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void bN() {
        this.f.e(true);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void bO() {
        this.f.V(new byyp("custom_sticker"));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final int bP() {
        if (le.r(V())) {
            return 2;
        }
        if (le.g(V())) {
            return 3;
        }
        if (le.y(V())) {
            return 7;
        }
        if (le.h(V())) {
            return 4;
        }
        if (le.s(V())) {
            return 5;
        }
        return le.B(V()) ? 6 : 1;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long bQ() {
        InputStream bM;
        csix.h();
        long l = l();
        if (l > 0) {
            return l;
        }
        Uri v = v();
        if (v != null) {
            try {
                bM = bM(v);
                try {
                    long available = bM.available();
                    bM.close();
                    return available;
                } finally {
                }
            } catch (Exception e) {
                csjb e2 = a.e();
                e2.I("Unable to get original media file size with original uri:");
                e2.I(v);
                e2.s(e);
            }
        }
        Uri t = t();
        if (t != null) {
            try {
                bM = bM(t);
                try {
                    long available2 = bM.available();
                    bM.close();
                    return available2;
                } finally {
                    try {
                        bM.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } catch (Exception e3) {
                csjb e4 = a.e();
                e4.I("Unable to get original media file size with content uri:");
                e4.I(t);
                e4.s(e3);
            }
        }
        return 0L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean ba() {
        return le.f(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bb() {
        return this.f.Q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bc() {
        return this.n.f().toEpochMilli() - this.f.F > TimeUnit.DAYS.toMillis((long) ((Integer) bzaq.h.e()).intValue());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bd() {
        return le.g(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean be() {
        byyu byyuVar = this.f.n;
        return byyuVar.f > 0 && byyuVar != byyu.CMS_MEDIA_DOWNLOADED;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bf() {
        return this.n.f().toEpochMilli() - this.f.M > TimeUnit.DAYS.toMillis((long) ((Integer) bzaq.h.e()).intValue());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bg() {
        return Objects.equals("custom_sticker", ad());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bh() {
        return bv() || bw();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bi() {
        return Objects.equals(this.f.e, "application/x-end-of-emergency-proto");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bj() {
        int i = this.f.x;
        return i == 11 || i == 26 || i == 34 || i == 35;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bk() {
        return le.i(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bl() {
        return le.j(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bm() {
        return I() == byza.GOOGLE_PHOTOS_LINK;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bn() {
        return le.m(this.f.e);
    }

    @Override // defpackage.bdov
    public final boolean bo() {
        return le.n(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bp() {
        bvwp bvwpVar = this.f;
        return (bvwpVar.t == eobe.a && bvwpVar.s == eobe.a) ? false : true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bq() {
        return le.q(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean br() {
        return this.f.P;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bs() {
        int i = this.f.x;
        return i == 16 || i == 17;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bt() {
        return le.t(this.f.e);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bu() {
        return this.t.a() ? !this.f.Z && ((bo() && !bp()) || bD()) : !this.u && ((bo() && !bp()) || bD());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bv() {
        return RbmSpecificMessage.CONTENT_TYPE.equals(this.f.e) && this.f.x == 15;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bw() {
        return RbmSpecificMessage.CONTENT_TYPE.equals(this.f.e) && this.f.x == 22;
    }

    @Override // defpackage.bdov
    public final boolean bx() {
        return N() == eohh.RICH_CARD_THUMBNAIL;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean by() {
        return bV(this.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bz() {
        return le.v(this.f.e);
    }

    @Override // defpackage.bdov
    public final int c() {
        return this.f.h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long d() {
        return this.f.F;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long e() {
        return this.f.M;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagePartData)) {
            return false;
        }
        MessagePartData messagePartData = (MessagePartData) obj;
        bvwp bvwpVar = this.f;
        Uri uri2 = bvwpVar.u;
        int i = bvwpVar.h;
        bvwp bvwpVar2 = messagePartData.f;
        return i == bvwpVar2.h && bvwpVar.i == bvwpVar2.i && bvwpVar.b.equals(bvwpVar2.b) && TextUtils.equals(this.f.c, messagePartData.f.c) && TextUtils.equals(this.f.e, messagePartData.f.e) && ((uri = this.f.d) != null ? uri.equals(messagePartData.f.d) : messagePartData.f.d == null) && TextUtils.equals(String.valueOf(uri2), String.valueOf(messagePartData.f.u)) && (uri2 != null ? uri2.equals(messagePartData.f.u) : messagePartData.f.u == null) && this.f.Y == messagePartData.f.Y;
    }

    public final int hashCode() {
        bvwp bvwpVar = this.f;
        int i = ((bvwpVar.h + 527) * 31) + bvwpVar.i;
        String b = bvwpVar.b.b();
        int hashCode = b.isEmpty() ? 0 : b.hashCode();
        String str = this.f.c;
        int hashCode2 = (((i * 31) + hashCode) * 31) + (str == null ? 0 : str.hashCode());
        String str2 = this.f.e;
        int hashCode3 = (hashCode2 * 31) + (str2 == null ? 0 : str2.hashCode());
        Uri uri = this.f.d;
        int hashCode4 = (hashCode3 * 31) + (uri == null ? 0 : uri.hashCode());
        String str3 = this.f.v;
        int hashCode5 = (hashCode4 * 31) + (str3 == null ? 0 : str3.hashCode());
        Uri uri2 = this.f.u;
        return (hashCode5 * 31) + (uri2 != null ? uri2.hashCode() : 0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long k() {
        return this.f.I;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long l() {
        return this.f.R;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long m() {
        return this.f.r;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long n() {
        csix.h();
        if (aZ() && (!((Boolean) cjja.a.e()).booleanValue() || !bm())) {
            Uri t = t();
            long b = t == null ? 0L : this.p.b(t);
            if (bo()) {
                if (!bl()) {
                    return 16384L;
                }
                ai();
                if (this.q.a(c(), b())) {
                    return (long) (b * 0.35f);
                }
            } else if (!ba()) {
                if (bD()) {
                    return ((k() != -1 ? k() : csuu.c(this.b, t())) * 4096) / TimeUnit.SECONDS.toMillis(1L);
                }
                if (!bC()) {
                    csjb e = a.e();
                    e.I("Unknown attachment type:");
                    e.I(V());
                    e.r();
                }
            }
            return b;
        }
        return 0L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long o() {
        return this.z;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long p() {
        return this.f.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long q() {
        if (!((coxi) this.j.b()).b()) {
            bvwp bvwpVar = this.f;
            if (bvwpVar.h == -1 || bvwpVar.i == -1) {
                if (bo()) {
                    ai();
                } else if (bD()) {
                    aj();
                }
            }
        }
        return this.f.a().x().a().B().longValue();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final ContentValues r() {
        csix.k(!this.f.b.c());
        ContentValues contentValues = new ContentValues();
        this.f.a().b(contentValues);
        if (this.f.h == -1) {
            contentValues.remove("width");
        }
        if (this.f.i == -1) {
            contentValues.remove("height");
        }
        return contentValues;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Rect s() {
        return bR(x(), ab());
    }

    @Override // defpackage.bdov
    public final Uri t() {
        Uri uri = this.f.d;
        if (uri == null || uri.toString().isEmpty()) {
            return null;
        }
        return this.f.d;
    }

    public final String toString() {
        String ae = ae();
        if (aX() && !TextUtils.isEmpty(ae)) {
            return cskt.b(ae).toString();
        }
        return V() + " (" + String.valueOf(t()) + ")";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri u() {
        return this.f.w;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public Uri v() {
        return this.f.f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri w() {
        return this.f.k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        csix.k(!this.w);
        this.f.a().writeToParcel(parcel, i);
        parcel.writeString(this.g);
        eppr epprVar = this.h;
        if (epprVar != null) {
            byte[] byteArray = epprVar.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        } else {
            parcel.writeInt(0);
        }
        if (this.y != null) {
            parcel.writeInt(1);
            parcel.writeParcelable(this.y, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.t.a()) {
            parcel.writeInt(this.f.Z ? 1 : 0);
        } else {
            parcel.writeInt(this.u ? 1 : 0);
        }
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeLong(this.z);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri x() {
        return this.f.u;
    }

    protected Uri y() {
        csix.k(!this.w);
        this.w = true;
        bvwp bvwpVar = this.f;
        Uri uri = bvwpVar.d;
        bvwpVar.aa(null);
        this.f.t(null);
        if (this.i.l(uri) || N() == eohh.RICH_CARD_THUMBNAIL || N() == eohh.RICH_CARD_MEDIA) {
            return uri;
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final awap z() {
        return this.f.W;
    }

    @Override // defpackage.bcpr
    protected final void h() {
    }

    public MessagePartData(cbar cbarVar, ffbr ffbrVar, cpaz cpazVar, bcwz bcwzVar, ctap ctapVar, cqoh cqohVar, ctyz ctyzVar, Context context, csuu csuuVar, cswf cswfVar, Optional optional, ctfn ctfnVar, errl errlVar, asmj asmjVar, ffbr ffbrVar2, MessagePartData messagePartData, aswd aswdVar) {
        this.i = cbarVar;
        this.j = ffbrVar;
        this.k = cpazVar;
        this.l = bcwzVar;
        this.m = ctapVar;
        this.n = cqohVar;
        this.o = ctyzVar;
        this.b = context;
        this.p = csuuVar;
        this.q = cswfVar;
        this.c = optional;
        this.r = ctfnVar;
        this.d = asmjVar;
        this.e = ffbrVar2;
        this.s = errlVar;
        this.t = aswdVar;
        this.f = messagePartData.f.a().x();
        this.h = messagePartData.h;
        this.v = messagePartData.v;
        this.u = messagePartData.u;
    }

    public MessagePartData(cbar cbarVar, ffbr ffbrVar, cpaz cpazVar, bcwz bcwzVar, ctap ctapVar, cqoh cqohVar, ctyz ctyzVar, Context context, csuu csuuVar, cswf cswfVar, Optional optional, ctfn ctfnVar, errl errlVar, asmj asmjVar, ffbr ffbrVar2, bcxc bcxcVar, aswd aswdVar) {
        byyz byyzVar;
        this.i = cbarVar;
        this.j = ffbrVar;
        this.k = cpazVar;
        this.l = bcwzVar;
        this.m = ctapVar;
        this.n = cqohVar;
        this.o = ctyzVar;
        this.b = context;
        this.p = csuuVar;
        this.q = cswfVar;
        this.c = optional;
        this.r = ctfnVar;
        this.s = errlVar;
        this.d = asmjVar;
        this.e = ffbrVar2;
        this.t = aswdVar;
        String[] strArr = PartsTable.a;
        bvwq bvwqVar = new bvwq();
        this.f = bvwqVar;
        bcql bcqlVar = (bcql) bcxcVar;
        bvwqVar.J(bcqlVar.a);
        bvwqVar.Y(bcqlVar.b);
        bvwqVar.t(bcqlVar.c);
        bvwqVar.aa(bcqlVar.d);
        bvwqVar.L(bcqlVar.e);
        bvwqVar.x(null);
        bvwqVar.ad(bcqlVar.f);
        bvwqVar.A(bcqlVar.g);
        bvwqVar.v(bcqlVar.h);
        bvwqVar.Q(null);
        bvwqVar.X(bcqlVar.i);
        bvwqVar.R(byzc.SUCCEEDED);
        bvwqVar.T(bcqlVar.j.a());
        bvwqVar.V(new byyp(bcqlVar.k));
        bvwqVar.U(new byyp(bcqlVar.l));
        bvwqVar.w(bcqlVar.o);
        bvwqVar.y(bcqlVar.p);
        bvwqVar.j(bcqlVar.u);
        bvwqVar.H(bcqlVar.m);
        bvwqVar.N(bcqlVar.q);
        bvwqVar.I(bcqlVar.t);
        bvwqVar.z(bcqlVar.s);
        bvwqVar.ac(bcqlVar.r);
        bvwqVar.S(bcqlVar.z);
        if (aswdVar.a()) {
            this.f.M(bcqlVar.v);
        }
        this.u = bcqlVar.v;
        awap awapVar = bcqlVar.x;
        if (awapVar != null) {
            this.f.P(awapVar);
        }
        if (cubs.f() && (byyzVar = bcqlVar.y) != null) {
            this.f.C(byyzVar);
        }
        LocationInformation locationInformation = bcqlVar.n;
        if (locationInformation == null) {
            this.f.F(eobe.a);
            this.f.D(eobe.a);
        } else {
            this.f.F(locationInformation.c);
            this.f.D(locationInformation.d);
        }
        this.g = bS(this.f);
        this.v = bcqlVar.w;
    }

    public MessagePartData(cbar cbarVar, ffbr ffbrVar, cpaz cpazVar, bcwz bcwzVar, ctap ctapVar, cqoh cqohVar, ctyz ctyzVar, Context context, csuu csuuVar, cswf cswfVar, Optional optional, ctfn ctfnVar, errl errlVar, asmj asmjVar, ffbr ffbrVar2, bjvm bjvmVar, aswd aswdVar) {
        this.i = cbarVar;
        this.j = ffbrVar;
        this.k = cpazVar;
        this.l = bcwzVar;
        this.m = ctapVar;
        this.n = cqohVar;
        this.o = ctyzVar;
        this.b = context;
        this.p = csuuVar;
        this.q = cswfVar;
        this.c = optional;
        this.r = ctfnVar;
        this.d = asmjVar;
        this.e = ffbrVar2;
        this.s = errlVar;
        this.t = aswdVar;
        String[] strArr = PartsTable.a;
        bvwq bvwqVar = new bvwq();
        this.f = bvwqVar;
        bjvmVar.az(93, "blob_id");
        bvwqVar.g(bjvmVar.w);
        bjvmVar.az(94, "blob_gaia_email");
        bvwqVar.f(bjvmVar.x);
        bjvmVar.az(98, "blob_upload_permanent_failure");
        bvwqVar.h(bjvmVar.y);
        bjvmVar.az(99, "blob_upload_timestamp");
        bvwqVar.i(bjvmVar.z);
        bjvmVar.az(103, "compressed_blob_id");
        bvwqVar.p(bjvmVar.D);
        bjvmVar.az(105, "compressed_blob_upload_permanent_failure");
        bvwqVar.q(bjvmVar.E);
        bjvmVar.az(106, "compressed_blob_upload_timestamp");
        bvwqVar.r(bjvmVar.F);
        bjvmVar.az(108, "compressed_media_encryption_key");
        bvwqVar.s(bjvmVar.H);
        bjvmVar.az(72, "content_type");
        bvwqVar.t(bjvmVar.e);
        bjvmVar.az(82, "conversation_id");
        bvwqVar.u(bjvmVar.m);
        bjvmVar.az(102, "duration");
        bvwqVar.v(bjvmVar.C);
        bjvmVar.az(100, "expressive_sticker_name");
        bvwqVar.w(bjvmVar.A);
        bjvmVar.az(90, "fallback_uri");
        bvwqVar.x(bjvmVar.u);
        bjvmVar.az(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "file_name");
        bvwqVar.y(bjvmVar.B);
        bjvmVar.az(76, "height");
        bvwqVar.A(bjvmVar.h);
        bjvmVar.az(68, "_id");
        bvwqVar.B(bjvmVar.a);
        bjvmVar.az(87, "latitude");
        bvwqVar.D(bjvmVar.r);
        bjvmVar.az(86, "longitude");
        bvwqVar.F(bjvmVar.q);
        bjvmVar.az(107, "media_encryption_key");
        bvwqVar.G(bjvmVar.G);
        bjvmVar.az(85, "media_modified_timestamp");
        bvwqVar.H(bjvmVar.p);
        bjvmVar.az(69, "message_id");
        bvwqVar.J(bjvmVar.b);
        bjvmVar.az(73, "original_uri");
        bvwqVar.L(bjvmVar.f);
        bjvmVar.az(78, "output_uri");
        bvwqVar.Q(bjvmVar.j);
        bjvmVar.az(89, "preview_content_type");
        bvwqVar.N(bjvmVar.t);
        bjvmVar.az(88, "preview_content_uri");
        bvwqVar.O(bjvmVar.s);
        bjvmVar.az(80, "processing_status");
        bvwqVar.R(bjvmVar.l);
        bjvmVar.az(91, "source");
        bvwqVar.T(bjvmVar.v);
        bjvmVar.az(84, "sticker_id");
        bvwqVar.U(bjvmVar.o);
        bjvmVar.az(83, "sticker_set_id");
        bvwqVar.V(bjvmVar.n);
        bjvmVar.az(79, "target_size");
        bvwqVar.X(bjvmVar.k);
        bjvmVar.az(70, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        bvwqVar.Y(bjvmVar.c);
        bjvmVar.az(77, "timestamp");
        bvwqVar.Z(bjvmVar.i);
        bjvmVar.az(71, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        bvwqVar.aa(bjvmVar.d);
        bjvmVar.az(75, "width");
        bvwqVar.ad(bjvmVar.g);
        bjvmVar.az(111, "file_size_bytes");
        bvwqVar.z(bjvmVar.I);
        bjvmVar.az(117, "rich_card_media_download_failure_reason");
        bvwqVar.S(bjvmVar.J);
        if (aswdVar.a()) {
            bvwp bvwpVar = this.f;
            bjvmVar.az(119, "preserve_size");
            bvwpVar.M(bjvmVar.K);
        }
        this.u = false;
        this.v = false;
    }

    public MessagePartData(cbar cbarVar, ffbr ffbrVar, cpaz cpazVar, bcwz bcwzVar, ctap ctapVar, cqoh cqohVar, ctyz ctyzVar, Context context, csuu csuuVar, cswf cswfVar, Optional optional, ctfn ctfnVar, errl errlVar, asmj asmjVar, ffbr ffbrVar2, PartsTable.BindData bindData, aswd aswdVar) {
        this.i = cbarVar;
        this.j = ffbrVar;
        this.k = cpazVar;
        this.l = bcwzVar;
        this.m = ctapVar;
        this.n = cqohVar;
        this.o = ctyzVar;
        this.b = context;
        this.p = csuuVar;
        this.q = cswfVar;
        this.c = optional;
        this.r = ctfnVar;
        this.s = errlVar;
        this.d = asmjVar;
        this.e = ffbrVar2;
        this.t = aswdVar;
        bvwp w = bindData.w();
        this.f = w;
        this.g = bS(w);
        this.v = false;
        this.u = false;
    }
}
