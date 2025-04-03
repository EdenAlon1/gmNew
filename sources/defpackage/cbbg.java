package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbbg extends cbbk {
    private static final cskc a = cskc.g("Bugle", "GifImageResource");
    private FrameSequence b;

    public cbbg(String str, FrameSequence frameSequence, cqoh cqohVar) {
        super(str, 1, cqohVar);
        this.b = frameSequence;
    }

    public static cbbg m(String str, InputStream inputStream, cqoh cqohVar) {
        try {
            try {
                FrameSequence decodeStream = FrameSequence.decodeStream(inputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                if (decodeStream == null) {
                    return null;
                }
                return new cbbg(str, decodeStream, cqohVar);
            } catch (IOException unused2) {
                return null;
            }
        } catch (UnsatisfiedLinkError unused3) {
            inputStream.close();
            return null;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    @Override // defpackage.cbcc
    public final int a() {
        csix.c("GifImageResource should not be used by a media cache");
        return 0;
    }

    @Override // defpackage.cbcc
    protected final void b() {
        o();
        try {
            this.b = null;
        } finally {
            r();
        }
    }

    @Override // defpackage.cbbk
    public final Bitmap d() {
        throw new cbbj();
    }

    @Override // defpackage.cbbk
    public final Bitmap e() {
        return null;
    }

    @Override // defpackage.cbbk
    public final Drawable f(Resources resources) {
        try {
            FrameSequence frameSequence = this.b;
            frameSequence.getClass();
            return new FrameSequenceDrawable(frameSequence);
        } catch (Throwable th) {
            a.o("Error getting drawable for GIF.", th);
            return null;
        }
    }

    @Override // defpackage.cbcc
    public final boolean h() {
        return false;
    }

    @Override // defpackage.cbbk
    public final boolean i() {
        return false;
    }

    @Override // defpackage.cbbk
    public final byte[] j() {
        throw new cbbj();
    }
}
