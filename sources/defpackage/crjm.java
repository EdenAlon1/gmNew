package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crjm implements cskg, crji {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl");
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl");
    private static Bitmap c;
    private static Bitmap d;
    private static Bitmap e;
    private static Bitmap f;
    private static Bitmap g;
    private static Bitmap h;
    private Bitmap i;
    private Bitmap j;
    private Bitmap k;
    private Bitmap l;
    private final Context m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final Optional q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;

    public crjm(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Optional optional, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.m = context;
        this.n = ffbrVar2;
        this.o = ffbrVar3;
        this.p = ffbrVar;
        this.q = optional;
        this.r = ffbrVar4;
        this.s = ffbrVar5;
        this.t = ffbrVar6;
        this.u = ffbrVar7;
    }

    public static String A(Uri uri) {
        csix.l(uri);
        return crjn.b(false, uri.getQueryParameter("i"));
    }

    private static int C(float f2, int i) {
        int round = Math.round(i * f2);
        if (round >= i) {
            return 0;
        }
        return round;
    }

    private static Uri D(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(crjd.a(context));
        builder.appendPath("o");
        return builder.build();
    }

    private static Uri E(Context context, Uri uri, Uri uri2) {
        csix.l(uri);
        csix.l(uri2);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(crjd.a(context));
        builder.appendPath("r");
        builder.appendQueryParameter("m", uri.toString());
        builder.appendQueryParameter("f", uri2.toString());
        return builder.build();
    }

    private static Uri F(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(crjd.a(context));
        builder.appendPath("p");
        return builder.build();
    }

    private final Uri G(Uri uri, Uri uri2) {
        if (csuu.w(uri)) {
            return E(this.m, uri, uri2);
        }
        if (!csuu.C(uri)) {
            return uri;
        }
        Context context = this.m;
        uri2.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(crjd.a(context));
        builder.appendPath("h");
        builder.appendQueryParameter("m", uri.toString());
        builder.appendQueryParameter("f", uri2.toString());
        return builder.build();
    }

    private static boolean H(boolean z, boolean z2) {
        return z && !z2;
    }

    private final synchronized Bitmap I(Context context, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i3;
        int i4;
        boolean z5 = false;
        if (z3 && !z) {
            z5 = true;
        }
        boolean H = H(z2, z);
        if (z) {
            bitmap = d;
            bitmap2 = g;
            i3 = R.drawable.quantum_ic_business_white_48;
            i4 = R.drawable.quantum_ic_business_white_24;
        } else if (H) {
            bitmap = e;
            bitmap2 = h;
            i3 = R.drawable.quantum_ic_report_black_48;
            i4 = R.drawable.quantum_ic_report_black_24;
        } else if (z5) {
            bitmap = this.i;
            bitmap2 = this.k;
            i3 = R.drawable.quantum_ic_do_not_disturb_black_48;
            i4 = R.drawable.quantum_ic_do_not_disturb_black_24;
        } else if (z4) {
            bitmap = this.j;
            bitmap2 = this.l;
            i3 = R.drawable.quantum_ic_sos_black_48;
            i4 = R.drawable.quantum_ic_sos_black_24;
        } else {
            bitmap = c;
            bitmap2 = f;
            i3 = R.drawable.ic_logo_avatar_anonymous_large;
            i4 = R.drawable.ic_logo_avatar_anonymous;
        }
        if (bitmap == null || bitmap2 == null) {
            if (bitmap == null) {
                Resources resources = context.getResources();
                Resources.Theme theme = context.getTheme();
                WeakHashMap weakHashMap = kpp.a;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) resources.getDrawable(i4, theme);
                bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            if (bitmap2 == null) {
                Resources resources2 = context.getResources();
                Resources.Theme theme2 = context.getTheme();
                WeakHashMap weakHashMap2 = kpp.a;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) resources2.getDrawable(i3, theme2);
                bitmap2 = bitmapDrawable2 != null ? bitmapDrawable2.getBitmap() : Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            if (z) {
                d = bitmap;
                g = bitmap2;
            } else if (H) {
                e = bitmap;
                h = bitmap2;
            } else if (z5) {
                this.i = bitmap;
                this.k = bitmap2;
            } else if (z4) {
                this.j = bitmap;
                this.l = bitmap2;
            } else {
                c = bitmap;
                f = bitmap2;
            }
        }
        if (i <= bitmap.getWidth()) {
            if (i2 <= bitmap.getHeight()) {
                return bitmap;
            }
        }
        return bitmap2;
    }

    private final Uri J(final Uri uri, CharSequence charSequence, aoku aokuVar, ParticipantColor participantColor, boolean z, boolean z2, boolean z3) {
        Uri build;
        if (uri != null) {
            String s = s(uri);
            if (crje.a.contains(s)) {
                ensk e2 = a.e();
                e2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl", "isVerifiedSmsApplicable", 643, "AvatarUriUtilImpl.java")).t("Provided Uri was Verified SMS applicable: %s", new enrw() { // from class: crjj
                    @Override // defpackage.enrw
                    public final Object a() {
                        return cskt.b(uri.toString());
                    }
                });
            } else if (TextUtils.equals("r", s)) {
                Uri n = n(uri);
                if (n == null || !crje.a.contains(s(n))) {
                    Uri m = m(uri);
                    if (m != null && crje.a.contains(s(m))) {
                        ensk e3 = a.e();
                        e3.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl", "isVerifiedSmsApplicable", 664, "AvatarUriUtilImpl.java")).t("Fallback Uri was Verified SMS applicable: %s", new enrw() { // from class: crjl
                            @Override // defpackage.enrw
                            public final Object a() {
                                return cskt.b(uri.toString());
                            }
                        });
                    }
                } else {
                    ensk e4 = a.e();
                    e4.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e4).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl", "isVerifiedSmsApplicable", 654, "AvatarUriUtilImpl.java")).t("Primary Uri was Verified SMS applicable: %s", new enrw() { // from class: crjk
                        @Override // defpackage.enrw
                        public final Object a() {
                            return cskt.b(uri.toString());
                        }
                    });
                }
            }
            ensk h2 = b.h();
            h2.Y(ente.a, "BugleAvatar");
            enrr enrrVar = (enrr) h2;
            enrrVar.Y(csux.X, uri);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl", "createAvatarUri", 271, "AvatarUriUtilImpl.java")).q("Avatar URI was verified SMS applicable");
            return uri;
        }
        if (((asvn) this.s.b()).a() && aokuVar != null && aokuVar.C()) {
            Context context = this.m;
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("content");
            builder.authority(crjd.a(context));
            builder.appendPath("sm");
            build = builder.build();
        } else if (z) {
            Uri.Builder builder2 = new Uri.Builder();
            builder2.scheme("content");
            builder2.authority(crjd.a(this.m));
            builder2.appendPath("z");
            if (participantColor == null) {
                participantColor = null;
            } else if (!participantColor.g()) {
                builder2.appendQueryParameter("x", String.valueOf(((cttz) this.o.b()).b()));
            }
            build = builder2.build();
        } else if (z3) {
            build = D(this.m);
        } else if (H(z2, false)) {
            build = F(this.m);
        } else {
            if (!TextUtils.isEmpty(charSequence)) {
                char charAt = charSequence.charAt(0);
                cstx cstxVar = (cstx) this.n.b();
                if ((charSequence.length() <= 0 || !cstxVar.e(charSequence.subSequence(0, 1))) && ((charSequence.length() < 2 || !cstxVar.e(charSequence.subSequence(0, 2))) && "+0123456789".indexOf(charAt) == -1)) {
                    build = e(charSequence, aokuVar, participantColor);
                }
            }
            Uri.Builder builder3 = new Uri.Builder();
            builder3.scheme("content");
            builder3.authority(crjd.a(this.m));
            builder3.appendPath("d");
            if (!aokuVar.E()) {
                cfva cfvaVar = aoqm.a;
                builder3.appendQueryParameter("i", aokuVar.p(((Boolean) new aopk().get()).booleanValue()));
            }
            if (participantColor == null) {
                participantColor = null;
            } else if (!participantColor.g()) {
                builder3.appendQueryParameter("x", String.valueOf(((cttz) this.o.b()).b()));
            }
            build = builder3.build();
        }
        return (uri == null || TextUtils.isEmpty(uri.toString())) ? build : z3 ? D(this.m) : !z2 ? (csuu.x(uri) && TextUtils.equals(s(uri), "l") && !TextUtils.isEmpty(charSequence)) ? e(charSequence, aokuVar, participantColor) : G(uri, build) : F(this.m);
    }

    public static Uri k(Context context) {
        return new Uri.Builder().scheme("content").authority(crjd.a(context)).appendPath("b").build();
    }

    public static Uri m(Uri uri) {
        csix.l(uri);
        String queryParameter = uri.getQueryParameter("f");
        if (queryParameter == null) {
            return null;
        }
        return Uri.parse(queryParameter);
    }

    public static Uri n(Uri uri) {
        csix.l(uri);
        String queryParameter = uri.getQueryParameter("m");
        if (queryParameter == null) {
            return null;
        }
        return Uri.parse(queryParameter);
    }

    public static Uri o(Context context, List list) {
        csix.l(list);
        csix.k(!list.isEmpty());
        if (list.size() == 1) {
            Uri uri = (Uri) list.get(0);
            csix.k(x(context, uri));
            return uri;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(crjd.a(context));
        builder.appendPath("g");
        int min = Math.min(list.size(), 4);
        for (int i = 0; i < min; i++) {
            Uri uri2 = (Uri) list.get(i);
            csix.l(uri2);
            emxf.l(csuu.w(uri2) || x(context, uri2) || csuu.C(uri2));
            builder.appendQueryParameter("p", uri2.toString());
        }
        return builder.build();
    }

    public static OptionalInt p(Uri uri) {
        uri.getClass();
        String queryParameter = uri.getQueryParameter("t");
        return queryParameter == null ? OptionalInt.empty() : OptionalInt.of(Integer.parseInt(queryParameter));
    }

    public static Integer q(Uri uri) {
        String queryParameter;
        csix.l(uri);
        if (uri == null || (queryParameter = uri.getQueryParameter("x")) == null) {
            return null;
        }
        return Integer.valueOf(queryParameter);
    }

    public static String r(String str, aoku aokuVar) {
        cfva cfvaVar = aoqm.a;
        return (aokuVar.y(((Boolean) new aopk().get()).booleanValue()) || aokuVar.E()) ? str : aokuVar.p(((Boolean) new aopk().get()).booleanValue());
    }

    public static String s(Uri uri) {
        return uri == null ? "d" : (String) Collection.EL.stream(uri.getPathSegments()).findFirst().orElse("d");
    }

    public static String t(Uri uri) {
        csix.l(uri);
        return crjn.a(uri.getQueryParameter("i"));
    }

    public static String u(Uri uri) {
        csix.l(uri);
        return uri.getQueryParameter("n");
    }

    public static List v(Uri uri) {
        csix.l(uri);
        return uri.getQueryParameters("p");
    }

    public static synchronized void w() {
        synchronized (crjm.class) {
            c = null;
            d = null;
            f = null;
            g = null;
        }
    }

    public static boolean x(Context context, Uri uri) {
        csix.l(uri);
        return uri != null && TextUtils.equals("content", uri.getScheme()) && TextUtils.equals(crjd.a(context), uri.getAuthority());
    }

    public static boolean y(Context context, Uri uri) {
        if (uri == null) {
            return false;
        }
        return x(context, uri) || csuu.u(uri) || csuu.C(uri) || s(uri).equals("h") || csuu.y(uri, cbgr.a(context)) || csuu.y(uri, String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.provider.RbmBusinessInfoFileProvider"));
    }

    public static Uri z(Context context, String str, boolean z, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(crjd.a(context));
        builder.appendPath("s");
        builder.appendQueryParameter("i", str);
        builder.appendQueryParameter("c", String.valueOf(i));
        builder.appendQueryParameter("s", String.valueOf(z));
        builder.appendQueryParameter("g", "false");
        return builder.build();
    }

    final int B(String str, boolean z, boolean z2, Integer num, boolean z3, boolean z4, boolean z5) {
        if (z4 && !z2) {
            return ((cttz) this.o.b()).b.getColor(R.color.block_icon_background_color_m2);
        }
        if (H(z3, z2)) {
            cttz cttzVar = (cttz) this.o.b();
            return cttzVar.c.g() ? cttzVar.b.getColor(R.color.spam_icon_background_color_m2_dark) : cttzVar.b.getColor(R.color.spam_icon_background_color_m2);
        }
        if (z5) {
            cttz cttzVar2 = (cttz) this.o.b();
            return cttzVar2.c.g() ? cttzVar2.b.getColor(R.color.emergency_avatar_background_color_dark) : cttzVar2.b.getColor(R.color.emergency_avatar_background_color);
        }
        if (!z) {
            return !z2 ? ((cttz) this.o.b()).d(str) : num == null ? ((cttz) this.o.b()).h(str).a : num.intValue();
        }
        cttz cttzVar3 = (cttz) this.o.b();
        if (((Boolean) ctty.a.e()).booleanValue()) {
            return cttzVar3.b.getColor(R.color.oneplus_unknown_sender_background);
        }
        return (cttzVar3.c.g() ? cttzVar3.e : cttzVar3.d)[0].getColor(0, 0);
    }

    @Override // defpackage.crji
    public final Uri a() {
        return f(null, null, ((aolr) this.r.b()).f(), null);
    }

    @Override // defpackage.crji
    public final Uri b(Uri uri, Uri uri2) {
        return G(uri, uri2);
    }

    @Override // defpackage.crji
    public final Uri c(Uri uri, byzi byziVar) {
        Uri build = new Uri.Builder().scheme("content").authority(crjd.a(this.m)).appendPath("z").appendQueryParameter("x", String.valueOf(this.m.getColor(true != ((crjx) this.p.b()).g() ? R.color.verified_sms_business_color_light : R.color.verified_sms_business_color_dark))).appendQueryParameter("v", Boolean.TRUE.toString()).build();
        if (byziVar != byzi.VERIFICATION_IN_PROGRESS && byziVar != byzi.VERIFICATION_NA) {
            if (byziVar == byzi.VERIFICATION_UNVERIFIED) {
                return new Uri.Builder().scheme("content").authority(crjd.a(this.m)).appendPath("u").appendQueryParameter("t", String.valueOf(this.m.getColor(true != ((crjx) this.p.b()).g() ? R.color.unverified_sms_business_foreground_color_light : R.color.unverified_sms_business_foreground_color_dark))).appendQueryParameter("x", String.valueOf(this.m.getColor(true != ((crjx) this.p.b()).g() ? R.color.unverified_sms_business_background_color_light : R.color.unverified_sms_business_background_color_dark))).appendQueryParameter("v", Boolean.TRUE.toString()).appendQueryParameter("vsms_autogen", String.valueOf(((Boolean) cuye.b.e()).toString()).concat(String.valueOf(UUID.randomUUID().toString()))).build();
            }
            if (uri != null && !TextUtils.isEmpty(uri.toString()) && !x(this.m, uri)) {
                return E(this.m, uri, build).buildUpon().appendQueryParameter("v", Boolean.TRUE.toString()).build();
            }
        }
        return build;
    }

    @Override // defpackage.crji
    public final RectF[] d(int i, int i2, int i3) {
        float f2 = i2;
        float f3 = i;
        RectF[] rectFArr = new RectF[i3];
        float f4 = f3 + 0.0f;
        float f5 = f3 / 2.0f;
        float f6 = f2 + 0.0f;
        float f7 = f2 / 2.0f;
        if (i3 == 2) {
            float sqrt = (float) ((2.0d - Math.sqrt(2.0d)) * f4);
            rectFArr[0] = new RectF(0.0f, 0.0f, sqrt, sqrt);
            rectFArr[1] = new RectF(f3 - sqrt, f2 - sqrt, f4, f6);
            return rectFArr;
        }
        if (i3 != 3) {
            rectFArr[0] = new RectF(0.0f, 0.0f, f5, f7);
            rectFArr[1] = new RectF(f5, 0.0f, f4, f7);
            rectFArr[2] = new RectF(0.0f, f7, f5, f6);
            rectFArr[3] = new RectF(f5, f7, f4, f6);
            return rectFArr;
        }
        float f8 = f3 / 4.0f;
        float f9 = f2 / 4.0f;
        float sqrt2 = (f2 - f9) - ((float) (f9 * Math.sqrt(3.0d)));
        rectFArr[0] = new RectF(f8, (sqrt2 - f9) + 0.0f, 3.0f * f8, sqrt2 + f9 + 0.0f);
        float f10 = f7 + 0.0f;
        rectFArr[1] = new RectF(0.0f, f10, f5, f6);
        rectFArr[2] = new RectF(f5, f10, f4, f6);
        return rectFArr;
    }

    @Override // defpackage.crji
    public final Uri e(CharSequence charSequence, aoku aokuVar, ParticipantColor participantColor) {
        csix.l(charSequence);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(crjd.a(this.m));
        builder.appendPath("l");
        String valueOf = String.valueOf(charSequence);
        builder.appendQueryParameter("n", valueOf);
        builder.appendQueryParameter("i", r(valueOf, aokuVar));
        if (participantColor != null && !participantColor.g()) {
            builder.appendQueryParameter("x", String.valueOf(((cttz) this.o.b()).b()));
        }
        return builder.build();
    }

    @Override // defpackage.crji
    public final Uri f(Uri uri, CharSequence charSequence, aoku aokuVar, ParticipantColor participantColor) {
        return J(uri, charSequence, aokuVar, participantColor, false, false, false);
    }

    @Override // defpackage.crji
    public final Uri g(Uri uri, CharSequence charSequence, aoku aokuVar, ParticipantColor participantColor, boolean z, boolean z2, boolean z3) {
        return J(uri, charSequence, aokuVar, participantColor, z, z2, z3);
    }

    @Override // defpackage.crji
    public final Uri h(Uri uri, CharSequence charSequence, aoku aokuVar, ParticipantColor participantColor, boolean z, boolean z2, boolean z3) {
        if (uri == null) {
            uri = null;
        } else if (((dulp) this.t.b()).b(uri)) {
            try {
                uri = ((dulp) this.t.b()).a((int) this.m.getResources().getDimension(R.dimen.avatar_display_size), uri);
            } catch (duln e2) {
                ensk i = a.i();
                i.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) i).g(e2)).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl", "updateFifeImageSize", (char) 908, "AvatarUriUtilImpl.java")).q("Unexpected InvalidUrlException thrown by fifeImageUrlUtil");
            }
        } else {
            enru enruVar = csuu.a;
            if (uri.toString().startsWith(csuu.c.toString())) {
                String lastPathSegment = uri.getLastPathSegment();
                lastPathSegment.getClass();
                Uri parse = Uri.parse(lastPathSegment);
                String queryParameter = parse.getQueryParameter("account_name");
                uri = csuu.c.buildUpon().appendPath(new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).appendQueryParameter("account_name", queryParameter).appendQueryParameter("lookup", parse.getQueryParameter("lookup")).build().toString()).encodedQuery(uri.getQuery()).build();
            } else if (csuu.y(uri, "com.android.contacts") && uri.getPathSegments().contains("photo")) {
                List<String> pathSegments = uri.getPathSegments();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < pathSegments.size(); i2++) {
                    sb.append('/');
                    if (pathSegments.get(i2).equals("photo")) {
                        sb.append("display_photo");
                    } else {
                        sb.append(pathSegments.get(i2));
                    }
                }
                uri = uri.buildUpon().path(sb.toString()).build();
            } else if (((atfc) this.u.b()).a() && csup.c(uri, "com.google.android.gms.people.gal.provider") && uri.getQueryParameterNames().contains("sz")) {
                Uri.Builder path = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath());
                for (String str : uri.getQueryParameterNames()) {
                    if (!str.equals("sz")) {
                        path.appendQueryParameter(str, uri.getQueryParameter(str));
                    }
                }
                uri = path.build();
            }
        }
        return J(uri, charSequence, aokuVar, participantColor, z, z2, z3);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [crjf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [crjf, java.lang.Object] */
    @Override // defpackage.crji
    public final Bitmap i(String str, int i, int i2, boolean z, boolean z2, Integer num, crjh crjhVar, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        int i3;
        int i4 = 0;
        if (!z4 || z) {
            z6 = z3;
            z7 = false;
        } else {
            z6 = z3;
            z7 = true;
        }
        boolean H = H(z6, z);
        if (!H && !z7 && !z && !z5) {
            this.q.isPresent();
            Drawable c2 = this.q.get().c();
            Drawable b2 = this.q.get().b();
            if (c2 != null && b2 != null) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                c2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                c2.draw(canvas);
                b2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                b2.draw(canvas);
                return createBitmap;
            }
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl", "renderDefaultAvatar", 1090, "AvatarUriUtilImpl.java")).q("backgroundDrawable or iconDrawable is null");
        }
        Bitmap g2 = crjhVar.g(i, i2, B(str, z2, z, num, H, z7, z5));
        Canvas canvas2 = new Canvas(g2);
        Bitmap I = I(this.m, z, i, i2, H, z7, z5);
        Paint paint = new Paint(1);
        if (z) {
            paint.setColorFilter(new PorterDuffColorFilter(((cttz) this.o.b()).c(), PorterDuff.Mode.SRC_IN));
            i4 = C(0.17f, i);
            i3 = C(0.17f, i2);
        } else if (z7) {
            cttz cttzVar = (cttz) this.o.b();
            paint.setColorFilter(new PorterDuffColorFilter(cttzVar.c.g() ? cttzVar.b.getColor(R.color.block_icon_foreground_color_m2_dark) : cttzVar.b.getColor(R.color.block_icon_foreground_color_m2), PorterDuff.Mode.SRC_IN));
            i4 = C(0.0f, i);
            i3 = C(0.0f, i2);
        } else if (H) {
            cttz cttzVar2 = (cttz) this.o.b();
            paint.setColorFilter(new PorterDuffColorFilter(cttzVar2.c.g() ? cttzVar2.b.getColor(R.color.spam_icon_foreground_color_m2_dark) : cttzVar2.b.getColor(R.color.spam_icon_foreground_color_m2), PorterDuff.Mode.SRC_IN));
            i4 = C(0.14f, i);
            i3 = C(0.14f, i2);
        } else if (z5) {
            cttz cttzVar3 = (cttz) this.o.b();
            paint.setColorFilter(new PorterDuffColorFilter(cttzVar3.c.g() ? cttzVar3.b.getColor(R.color.emergency_avatar_foreground_color_dark) : cttzVar3.b.getColor(R.color.emergency_avatar_foreground_color), PorterDuff.Mode.SRC_IN));
            i4 = C(0.2f, i);
            i3 = C(0.2f, i2);
        } else {
            paint.setColorFilter(new PorterDuffColorFilter(((cttz) this.o.b()).c(), PorterDuff.Mode.SRC_IN));
            i3 = 0;
        }
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, I.getWidth(), I.getHeight()), new RectF(i4, i3, i - i4, i2 - i3), Matrix.ScaleToFit.FILL);
        canvas2.drawBitmap(I, matrix, paint);
        return g2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005d  */
    /* JADX WARN: Type inference failed for: r2v7, types: [crjf, java.lang.Object] */
    @Override // defpackage.crji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap j(java.lang.String r14, java.lang.String r15, int r16, int r17, java.lang.Integer r18, defpackage.crjh r19, boolean r20, j$.util.OptionalInt r21) {
        /*
            r13 = this;
            r8 = r16
            r9 = r17
            int r10 = java.lang.Math.min(r16, r17)
            r11 = 0
            r1 = 0
            if (r20 != 0) goto L5a
            j$.util.Optional r2 = r13.q
            r2.isPresent()
            j$.util.Optional r2 = r13.q
            java.lang.Object r2 = r2.get()
            android.graphics.drawable.Drawable r2 = r2.a(r15)
            if (r2 == 0) goto L38
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r8, r9, r1)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r1)
            int r5 = r4.getWidth()
            int r6 = r4.getHeight()
            r2.setBounds(r11, r11, r5, r6)
            r2.draw(r4)
            r12 = r4
            goto L5b
        L38:
            enru r2 = defpackage.crjm.a
            ensk r2 = r2.j()
            ensn r4 = defpackage.ente.a
            java.lang.String r5 = "Bugle"
            r2.Y(r4, r5)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r4 = "renderLetterTile"
            r5 = 1214(0x4be, float:1.701E-42)
            java.lang.String r6 = "com/google/android/apps/messaging/shared/ui/avatar/AvatarUriUtilImpl"
            java.lang.String r7 = "AvatarUriUtilImpl.java"
            ensk r2 = r2.h(r6, r4, r5, r7)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r4 = "backgroundDrawable is null"
            r2.q(r4)
        L5a:
            r12 = r1
        L5b:
            if (r1 != 0) goto L71
            r6 = 0
            r7 = 0
            r2 = 0
            r5 = 0
            r0 = r13
            r1 = r15
            r4 = r18
            r3 = r20
            int r1 = r0.B(r1, r2, r3, r4, r5, r6, r7)
            r2 = r19
            android.graphics.Bitmap r1 = r2.g(r8, r9, r1)
        L71:
            float r2 = (float) r9
            float r3 = (float) r8
            android.content.Context r4 = r13.m
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.Paint r5 = new android.graphics.Paint
            r6 = 1
            r5.<init>(r6)
            android.content.Context r7 = r13.m
            android.graphics.Typeface r7 = defpackage.crlw.a(r7)
            r5.setTypeface(r7)
            ffbr r7 = r13.o
            java.lang.Object r7 = r7.b()
            cttz r7 = (defpackage.cttz) r7
            int r7 = r7.c()
            r8 = r21
            int r7 = r8.orElse(r7)
            r5.setColor(r7)
            r7 = 2131361811(0x7f0a0013, float:1.8343385E38)
            float r4 = r4.getFraction(r7, r6, r6)
            float r7 = (float) r10
            float r4 = r4 * r7
            r5.setTextSize(r4)
            java.lang.String r4 = r14.substring(r11, r6)
            android.content.Context r7 = r13.m
            java.util.Locale r7 = defpackage.ctid.c(r7)
            java.lang.String r4 = r4.toUpperCase(r7)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r5.getTextBounds(r4, r11, r6, r7)
            int r6 = r7.centerX()
            float r6 = (float) r6
            int r7 = r7.centerY()
            float r7 = (float) r7
            if (r12 != 0) goto Ld0
            android.graphics.Canvas r12 = new android.graphics.Canvas
            r12.<init>(r1)
        Ld0:
            r8 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r8
            float r2 = r2 / r8
            float r2 = r2 - r7
            float r3 = r3 - r6
            r12.drawText(r4, r3, r2, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crjm.j(java.lang.String, java.lang.String, int, int, java.lang.Integer, crjh, boolean, j$.util.OptionalInt):android.graphics.Bitmap");
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        w();
    }
}
