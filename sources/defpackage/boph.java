package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class boph extends dtro {
    public String a;
    public MessageIdType b = bdhb.a;
    public long[] c;
    public long[] d;
    public long[] e;
    public Optional[] f;
    public long[] g;

    protected boph() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ReadReportsConcatView [read_reports.read_reports__id: %s,\n  read_reports.read_reports_message_id: %s,\n  read_reports.read_reports_participant_id: %s,\n  read_reports.read_reports_receive_time: %s,\n  read_reports.read_reports_read_time: %s,\n  read_reports.read_reports_ftd_time: %s,\n  read_reports.read_reports_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), aJ(this.c), aJ(this.d), aJ(this.e), aK(this.f), aJ(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        Integer.valueOf(boqc.b().a()).getClass();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        boqb boqbVar = (boqb) dtsuVar;
        aB();
        this.cL = boqbVar.cU();
        if (boqbVar.di(0)) {
            this.a = boqbVar.getString(boqbVar.cM(0, boqc.a));
            fY(0);
        }
        if (boqbVar.di(1)) {
            this.b = new MessageIdType(boqbVar.getLong(boqbVar.cM(1, boqc.a)));
            fY(1);
        }
        if (boqbVar.di(2)) {
            this.c = dtub.B(null, boqb.ds(boqbVar.getString(boqbVar.cM(2, boqc.a))));
            fY(2);
        }
        if (boqbVar.di(3)) {
            this.d = dtub.B(null, boqb.ds(boqbVar.getString(boqbVar.cM(3, boqc.a))));
            fY(3);
        }
        if (boqbVar.di(4)) {
            this.e = dtub.B(null, boqb.ds(boqbVar.getString(boqbVar.cM(4, boqc.a))));
            fY(4);
        }
        if (boqbVar.di(5)) {
            long[] ds = boqb.ds(boqbVar.getString(boqbVar.cM(5, boqc.a)));
            int length = ds.length;
            Optional[] optionalArr = new Optional[length];
            for (int i = 0; i < length; i++) {
                optionalArr[i] = bdhe.b(ds[i]);
            }
            this.f = (Optional[]) dtub.C(null, optionalArr, new Optional[0]);
            fY(5);
        }
        if (boqbVar.di(6)) {
            this.g = dtub.B(null, boqb.ds(boqbVar.getString(boqbVar.cM(6, boqc.a))));
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof boph)) {
            return false;
        }
        boph bophVar = (boph) obj;
        return super.aD(bophVar.cL) && Objects.equals(this.a, bophVar.a) && Objects.equals(this.b, bophVar.b) && Arrays.equals(this.c, bophVar.c) && Arrays.equals(this.d, bophVar.d) && Arrays.equals(this.e, bophVar.e) && Arrays.equals(this.f, bophVar.f) && Arrays.equals(this.g, bophVar.g);
    }

    public final long[] f() {
        az(2, "participant_id");
        return this.c;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ReadReportsConcatView -- REDACTED") : a();
    }
}
