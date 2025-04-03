package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class figd implements figg {
    final /* synthetic */ File a;

    public figd(File file) {
        this.a = file;
    }

    @Override // defpackage.figg
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileInputStream(this.a).getChannel());
    }
}
