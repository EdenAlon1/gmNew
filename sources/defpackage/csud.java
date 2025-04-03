package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csud {
    public static final eohj a(String str) {
        return le.n(str) ? eohj.IMAGE : le.A(str) ? eohj.VIDEO : le.f(str) ? eohj.AUDIO : le.z(str) ? eohj.VCARD : le.x(str) ? eohj.TEXT : le.r(str) ? eohj.PDF : le.g(str) ? eohj.CALENDAR : le.y(str) ? eohj.TXT : le.h(str) ? eohj.DOC : le.s(str) ? eohj.PPT : le.B(str) ? eohj.XLS : !le.l(str) ? ("application/vnd.android.package-archive".equals(str) || "application/zip".equals(str) || "application/java-archive".equals(str)) ? eohj.COMPRESSED : eohj.UNKNOWN_BUGLE_CONTENT_TYPE : eohj.HTML;
    }
}
